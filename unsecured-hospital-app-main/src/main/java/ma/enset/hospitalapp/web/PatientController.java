package ma.enset.hospitalapp.web;

import jakarta.validation.Valid;
import ma.enset.hospitalapp.entities.Patient;
import ma.enset.hospitalapp.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;
    @GetMapping(path = "/user/index")
    public String index(Model model,
                        @RequestParam(name = "page",defaultValue = "0") int page,
                        @RequestParam(name = "size",defaultValue = "5") int size,
                        @RequestParam(name = "keyword",defaultValue = "") String kw
                        ){
        Page<Patient> pagePatients = patientRepository.findByNomContains(kw, PageRequest.of(page,size));
        model.addAttribute("listPatients",pagePatients.getContent());
        model.addAttribute("pages",new int[pagePatients.getTotalPages()]);
        model.addAttribute("currentPage",page);
        model.addAttribute("keyword",kw);
        return "patients";
    }
    @GetMapping("/admin/deletePatient")
    //@PreAuthorize("hasRole('ROLE ADMIN')")
    public String deletePatient(@RequestParam(name = "id") Long id, String keyword, int page){
        patientRepository.deleteById(id);
        return "redirect:/user/index?page="+page+"&keyword="+keyword;
    }
    @GetMapping("/admin/formPatients")
    //@PreAuthorize("hasRole('ROLE ADMIN')")
    public String formPatient(Model model ){
        model.addAttribute("patient",new Patient());
        return "formPatients";
    }
    @PostMapping("/admin/save")
    //@PreAuthorize("hasRole('ROLE ADMIN')")
    public String save(@Valid Patient patient, BindingResult bindingResult,
                              @RequestParam(defaultValue = "0") int page,
                              @RequestParam(defaultValue = "") String keyword){
        if (bindingResult.hasErrors()) return "formPatients";
        patientRepository.save(patient);
        return "redirect:/user/index?page="+page+"&keyword="+keyword;
    }
    @GetMapping("/admin/editPatient")
   // @PreAuthorize("hasRole('ROLE ADMIN')")
    public String editPatient(Model model,Long id,String keyword, int page){
        Patient patient = patientRepository.findById(id).orElse(null);
        if (patient==null) throw new RuntimeException("Patient introuvable!!!");
        model.addAttribute("patient",patient);
        model.addAttribute("page",page);
        model.addAttribute("keyword",keyword);
        return "editPatient";
    }
    @GetMapping("/")
    public String home(){
        return "redirect:/user/index";
    }
}
