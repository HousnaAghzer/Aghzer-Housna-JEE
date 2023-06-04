# Activité N°5 - Part 1 : Spring Angular Digital Banking, Part 2 In progress

### Structure de projet :
<img width="268" alt="153" src="https://user-images.githubusercontent.com/123586109/235750194-81693c5a-e0d9-4dc0-baa2-04eb33dce242.PNG">

### Package entities :
+ Class Customer : 
<img width="474" alt="155" src="https://user-images.githubusercontent.com/123586109/235750770-beff467d-c4b5-45c1-90e1-91dc3dc8c5e9.PNG">

+ Class BankAccount : 
<img width="740" alt="154" src="https://user-images.githubusercontent.com/123586109/235750879-40f84cfd-bc95-4b97-92e6-ded55b292b3d.PNG">

+ Class CurrentAccount : 
<img width="371" alt="156" src="https://user-images.githubusercontent.com/123586109/235751800-ce193876-0d9b-4d5b-b39f-bfa84a9ef273.PNG">

+ Class SavingAccount :
<img width="335" alt="157" src="https://user-images.githubusercontent.com/123586109/235751876-ccb17745-17f9-417d-8a08-18105dfd7fe4.PNG">

+ Class AccountOperation :
<img width="407" alt="158" src="https://user-images.githubusercontent.com/123586109/235801395-3e1f97ac-2d27-493c-8d72-4b9a69a5ba1f.PNG">

### Package enums :
+ Class AccountStatus :
<img width="279" alt="159" src="https://user-images.githubusercontent.com/123586109/235802152-6115fd37-c8af-4a2c-ae9b-c60f160827e1.PNG">

+ Class OperationType :
<img width="276" alt="160" src="https://user-images.githubusercontent.com/123586109/235803303-9b75052f-009b-446d-8cc9-a53b803db9f3.PNG">

### Package repositories :
+ Interface CustomerRepository :
<img width="498" alt="162" src="https://user-images.githubusercontent.com/123586109/235803671-ee42b3b9-5f7c-4941-8dfa-3b6f998bc767.PNG">

+ Interface BankAccountRepository :
<img width="552" alt="161" src="https://user-images.githubusercontent.com/123586109/235803573-56571ce4-b5b1-4405-ad1c-ec82f31bff93.PNG">

+ Interface AccountOperationRepository : 
<img width="598" alt="163" src="https://user-images.githubusercontent.com/123586109/235804215-25f2a17b-0f79-4724-bee7-32a6b0ace8b5.PNG">

### Package service :
+ Class BankService :
<img width="796" alt="164" src="https://user-images.githubusercontent.com/123586109/235805249-be363cec-506d-4c61-8d26-3bdca27e283b.PNG">

### Class main EbankingBackendApplication : 
<img width="724" alt="165" src="https://user-images.githubusercontent.com/123586109/235806770-90b31846-dccd-4c98-8225-a916c1fd5363.PNG">
<img width="740" alt="166" src="https://user-images.githubusercontent.com/123586109/235806779-fc8c9fbd-e68e-4abe-b071-5777545539b0.PNG">
<img width="720" alt="167" src="https://user-images.githubusercontent.com/123586109/235806790-d8aa6ee1-e593-4426-b632-923bdee143bb.PNG">

### Configuration file application.properties :
<img width="579" alt="168" src="https://user-images.githubusercontent.com/123586109/235806838-e46871da-fecf-46cc-acd9-3630e1708da5.PNG">

### H2 Database :
+ With SINGLE_TABLE :
<img width="409" alt="139" src="https://user-images.githubusercontent.com/123586109/235807427-113c0a34-6f4c-4c2e-9186-f983e5bde3fa.PNG">
<img width="689" alt="140" src="https://user-images.githubusercontent.com/123586109/235807515-6ab1ce10-07f5-4fe3-b682-675ed335600d.PNG">
<img width="440" alt="141" src="https://user-images.githubusercontent.com/123586109/235807528-99eb51ab-7339-4dc5-9170-8c58821e695e.PNG">

+ With TABLE_PER_CLASS :
<img width="573" alt="142" src="https://user-images.githubusercontent.com/123586109/235807585-3a9e5b5e-b2e1-47a2-b1cc-66b76cde39dc.PNG">
<img width="589" alt="143" src="https://user-images.githubusercontent.com/123586109/235807610-d8f8951e-a5d8-4ef1-969f-50edcf2dfd8d.PNG">

+ With JOINED : 
<img width="656" alt="144" src="https://user-images.githubusercontent.com/123586109/235807649-7a4c9dd4-4c63-4584-b626-7b951ee25255.PNG">
<img width="258" alt="145" src="https://user-images.githubusercontent.com/123586109/235807665-dbd0ac90-b004-439c-993e-e2093d0c2f7f.PNG">
<img width="275" alt="146" src="https://user-images.githubusercontent.com/123586109/235807677-2242c1fd-fb9b-4f7a-9574-43800510783d.PNG">

### Mysql Database :
<img width="161" alt="147" src="https://user-images.githubusercontent.com/123586109/235807719-b4d49c3d-9347-4473-a0e1-db2914c864d1.PNG">
<img width="374" alt="148" src="https://user-images.githubusercontent.com/123586109/235807733-13b3cf90-4263-4e19-8f3e-b26b2fdd69b3.PNG">
<img width="824" alt="149" src="https://user-images.githubusercontent.com/123586109/235807743-5e605447-2cd7-4cc0-a4fe-0b1a4fddb59c.PNG">
<img width="688" alt="150" src="https://user-images.githubusercontent.com/123586109/235807748-da9c30c3-8a1c-4be8-9936-3b95cf008f6f.PNG">

### Results : 
+ With EAGER mode :
<img width="318" alt="151" src="https://user-images.githubusercontent.com/123586109/235807781-5c69cbc6-2c8b-4718-ba52-79f503c16124.PNG">

+ With LAZY mode :
<img width="851" alt="152" src="https://user-images.githubusercontent.com/123586109/235807803-1f3fe72b-08e6-4f93-ac2b-8287a4cd7dc2.PNG">












