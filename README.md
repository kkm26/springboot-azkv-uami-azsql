# DBKEYVAULT
Spring-boot + Managed Identities + Azure Key Vault + Azure SQL

Sample Code
- Spring Boot
- User-Assigned Managed Identity on Azure App Services
- Azure Key Vault
- Azure SQL


Testing Steps on Azure
1. Create Resource Group
2. Create Key Vault, add Spring JPA secrets
    - spring-datasource-url
    - spring-datasource-username
    - spring-datasource-password
3. Create User-Assigned Managed Identity
4. Assign Access Policy from Key Vault to User-Assigned MI
5. Edit App Service and Plan setting in pom.xml
6. Deploy from Maven to Azure with command
    mvn -DskipTests -Dmy.subscriptionId=ssssssss-ssss-ssss-ssss-ssssssssssss  -e clean package -P prod azure-webapp:deploy
7. At Azure Portal, goto App Service -> Identity -> User assigned and add User-Assigned MI in step 3
8. At App Service, goto Setting -> Configuration and add the following Application Settings. Save and restart App Service
    - USER_MANAGED_IDENTITY_CLIENT_ID
    - TENANT_ID
    - KEYVAULT_URI
