# Getting started

Códigos postais de Portugal usando a base de dados dos CTT.

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=Codigo%20Postal%20Portugal-Java&workspaceName=CodigoPostalPortugal&projectName=CodigoPostalPortugalLib&rootNamespace=com.example)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=Codigo%20Postal%20Portugal-Java&workspaceName=CodigoPostalPortugal&projectName=CodigoPostalPortugalLib&rootNamespace=com.example)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=Codigo%20Postal%20Portugal-Java&workspaceName=CodigoPostalPortugal&projectName=CodigoPostalPortugalLib&rootNamespace=com.example)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=Codigo%20Postal%20Portugal-Java&workspaceName=CodigoPostalPortugal&projectName=CodigoPostalPortugalLib&rootNamespace=com.example)

## How to Use

The following section explains how to use the CodigoPostalPortugal library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=Codigo%20Postal%20Portugal-Java&workspaceName=CodigoPostalPortugal&projectName=CodigoPostalPortugalLib&rootNamespace=com.example)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=Codigo%20Postal%20Portugal-Java&workspaceName=CodigoPostalPortugal&projectName=CodigoPostalPortugalLib&rootNamespace=com.example)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=Codigo%20Postal%20Portugal-Java&workspaceName=CodigoPostalPortugal&projectName=CodigoPostalPortugalLib&rootNamespace=com.example)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=Codigo%20Postal%20Portugal-Java&workspaceName=CodigoPostalPortugal&projectName=CodigoPostalPortugalLib&rootNamespace=com.example)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=Codigo%20Postal%20Portugal-Java&workspaceName=CodigoPostalPortugal&projectName=CodigoPostalPortugalLib&rootNamespace=com.example)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *CodigoPostalPortugalLib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=Codigo%20Postal%20Portugal-Java&workspaceName=CodigoPostalPortugal&projectName=CodigoPostalPortugalLib&rootNamespace=com.example)

Clicking the ``` Add ``` button will open a dialog where you need to specify CodigoPostalPortugal in ``` Group Id ``` and CodigoPostalPortugalLib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=Codigo%20Postal%20Portugal-Java&workspaceName=CodigoPostalPortugal&projectName=CodigoPostalPortugalLib&rootNamespace=com.example)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=Codigo%20Postal%20Portugal-Java&workspaceName=CodigoPostalPortugal&projectName=CodigoPostalPortugalLib&rootNamespace=com.example)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *CodigoPostalPortugalLib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### 

API client can be initialized as following.

```java

CodigoPostalPortugalClient client = new CodigoPostalPortugalClient();
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [DistritosController](#distritos_controller)
* [ConcelhosController](#concelhos_controller)
* [MoradasController](#moradas_controller)
* [CodigosController](#codigos_controller)
* [MiscController](#misc_controller)

## <a name="distritos_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.DistritosController") DistritosController

### Get singleton instance

The singleton instance of the ``` DistritosController ``` class can be accessed from the API Client.

```java
DistritosController distritos = client.getDistritos();
```

### <a name="get_dist_todos_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.DistritosController.getDistTodosAsync") getDistTodosAsync

> Obter todos os registos


```java
void getDistTodosAsync(final APICallBack<List<DistTodos1>> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
distritos.getDistTodosAsync(new APICallBack<List<DistTodos1>>() {
    public void onSuccess(HttpContext context, List<DistTodos1> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_dist_unico_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.DistritosController.getDistUnicoAsync") getDistUnicoAsync

> Obter um único distrito.


```java
void getDistUnicoAsync(
        final String designacaoDistrito,
        final APICallBack<List<DistUnico1>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| designacaoDistrito |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String designacaoDistrito = "Lisboa";
// Invoking the API call with sample inputs
distritos.getDistUnicoAsync(designacaoDistrito, new APICallBack<List<DistUnico1>>() {
    public void onSuccess(HttpContext context, List<DistUnico1> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_dist_erro1_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.DistritosController.getDistErro1Async") getDistErro1Async

> Erro. Parâmetros válidos: [ designacaoDistrito ]


```java
void getDistErro1Async(
        final String nomeDistrito,
        final APICallBack<List<DistMultiplos1>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| nomeDistrito |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String nomeDistrito = "Lisboa";
// Invoking the API call with sample inputs
distritos.getDistErro1Async(nomeDistrito, new APICallBack<List<DistMultiplos1>>() {
    public void onSuccess(HttpContext context, List<DistMultiplos1> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 404 | Not Found |



[Back to List of Controllers](#list_of_controllers)

## <a name="concelhos_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.ConcelhosController") ConcelhosController

### Get singleton instance

The singleton instance of the ``` ConcelhosController ``` class can be accessed from the API Client.

```java
ConcelhosController concelhos = client.getConcelhos();
```

### <a name="get_con_todos_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.ConcelhosController.getConTodosAsync") getConTodosAsync

> Obter todos os concelhos


```java
void getConTodosAsync(final APICallBack<List<ConTodos1>> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
concelhos.getConTodosAsync(new APICallBack<List<ConTodos1>>() {
    public void onSuccess(HttpContext context, List<ConTodos1> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_con_por_dist_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.ConcelhosController.getConPorDistAsync") getConPorDistAsync

> Obter todos os concelhos de um distrito


```java
void getConPorDistAsync(
        final String designacaoDistrito,
        final APICallBack<List<ConPorDist1>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| designacaoDistrito |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String designacaoDistrito = "Lisboa";
// Invoking the API call with sample inputs
concelhos.getConPorDistAsync(designacaoDistrito, new APICallBack<List<ConPorDist1>>() {
    public void onSuccess(HttpContext context, List<ConPorDist1> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_con_um_concelho_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.ConcelhosController.getConUmConcelhoAsync") getConUmConcelhoAsync

> Obter um ou mais concelhos


```java
void getConUmConcelhoAsync(
        final String designacaoConcelho,
        final APICallBack<List<ConUmConcelho1>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| designacaoConcelho |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String designacaoConcelho = "Ponta Delgada";
// Invoking the API call with sample inputs
concelhos.getConUmConcelhoAsync(designacaoConcelho, new APICallBack<List<ConUmConcelho1>>() {
    public void onSuccess(HttpContext context, List<ConUmConcelho1> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_con_num_dist_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.ConcelhosController.getConNumDistAsync") getConNumDistAsync

> Obter um ou mais concelhos num determinado distrito.


```java
void getConNumDistAsync(
        final String designacaoDistrito,
        final String designacaoConcelho,
        final APICallBack<List<ConNumDist1>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| designacaoDistrito |  ``` Required ```  | TODO: Add a parameter description |
| designacaoConcelho |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String designacaoDistrito = "Lisboa";
String designacaoConcelho = "S%";
// Invoking the API call with sample inputs
concelhos.getConNumDistAsync(designacaoDistrito, designacaoConcelho, new APICallBack<List<ConNumDist1>>() {
    public void onSuccess(HttpContext context, List<ConNumDist1> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 501 | Not Implemented |



### <a name="get_con_erro1_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.ConcelhosController.getConErro1Async") getConErro1Async

> Erro. Parâmetros válidos: [ designacaoDistrito | designacaoConcelho ]


```java
void getConErro1Async(
        final String designacaoDistrito,
        final String designacaoConcelho,
        final String cidade,
        final APICallBack<List<ConNumDist1>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| designacaoDistrito |  ``` Required ```  | TODO: Add a parameter description |
| designacaoConcelho |  ``` Required ```  | TODO: Add a parameter description |
| cidade |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String designacaoDistrito = "Lisboa";
String designacaoConcelho = "S%";
String cidade = "Porto";
// Invoking the API call with sample inputs
concelhos.getConErro1Async(designacaoDistrito, designacaoConcelho, cidade, new APICallBack<List<ConNumDist1>>() {
    public void onSuccess(HttpContext context, List<ConNumDist1> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 501 | Not Implemented |



### <a name="get_con_erro2_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.ConcelhosController.getConErro2Async") getConErro2Async

> Erro. Parâmetros válidos: [ designacaoDistrito | designacaoConcelho ]


```java
void getConErro2Async(
        final String nomeDistrito,
        final String designacaoConcelho,
        final APICallBack<List<ConNumDist1>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| nomeDistrito |  ``` Required ```  | TODO: Add a parameter description |
| designacaoConcelho |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String nomeDistrito = "Lisboa";
String designacaoConcelho = "S%";
// Invoking the API call with sample inputs
concelhos.getConErro2Async(nomeDistrito, designacaoConcelho, new APICallBack<List<ConNumDist1>>() {
    public void onSuccess(HttpContext context, List<ConNumDist1> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 404 | Not Found |
| 501 | Not Implemented |



[Back to List of Controllers](#list_of_controllers)

## <a name="moradas_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.MoradasController") MoradasController

### Get singleton instance

The singleton instance of the ``` MoradasController ``` class can be accessed from the API Client.

```java
MoradasController moradas = client.getMoradas();
```

### <a name="get_mor_todas_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MoradasController.getMorTodasAsync") getMorTodasAsync

> Obter todos os registos.


```java
void getMorTodasAsync(final APICallBack<List<MorTodas1>> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
moradas.getMorTodasAsync(new APICallBack<List<MorTodas1>>() {
    public void onSuccess(HttpContext context, List<MorTodas1> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_mor_codigo4_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MoradasController.getMorCodigo4Async") getMorCodigo4Async

> Obter todos os códigos postais com base em 4 digitos.


```java
void getMorCodigo4Async(
        final int codPostal4,
        final APICallBack<List<MorCodigo4A>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| codPostal4 |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int codPostal4 = 9545;
// Invoking the API call with sample inputs
moradas.getMorCodigo4Async(codPostal4, new APICallBack<List<MorCodigo4A>>() {
    public void onSuccess(HttpContext context, List<MorCodigo4A> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_mor_codigo7_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MoradasController.getMorCodigo7Async") getMorCodigo7Async

> Obter todos os códigos postais com base em 7 digitos.


```java
void getMorCodigo7Async(
        final int codPostal4,
        final int codPostal3,
        final APICallBack<List<MorCodigo7A>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| codPostal4 |  ``` Required ```  | TODO: Add a parameter description |
| codPostal3 |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int codPostal4 = 9545;
int codPostal3 = 122;
// Invoking the API call with sample inputs
moradas.getMorCodigo7Async(codPostal4, codPostal3, new APICallBack<List<MorCodigo7A>>() {
    public void onSuccess(HttpContext context, List<MorCodigo7A> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_mor_erro1_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MoradasController.getMorErro1Async") getMorErro1Async

> Erro. Parâmetros válidos: [ codPostal4 [ codPostal3 ] ]


```java
void getMorErro1Async(
        final int codigoPostal4,
        final int codPostal3,
        final APICallBack<List<MorCodigo7A>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| codigoPostal4 |  ``` Required ```  | TODO: Add a parameter description |
| codPostal3 |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int codigoPostal4 = 9545;
int codPostal3 = 122;
// Invoking the API call with sample inputs
moradas.getMorErro1Async(codigoPostal4, codPostal3, new APICallBack<List<MorCodigo7A>>() {
    public void onSuccess(HttpContext context, List<MorCodigo7A> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 404 | Not Found |



### <a name="get_mor_erro2_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MoradasController.getMorErro2Async") getMorErro2Async

> Erro. Parâmetros válidos: [ codPostal4 [ codPostal3 ] ]


```java
void getMorErro2Async(
        final int codPostal4,
        final int codPostal3,
        final String localidade,
        final APICallBack<List<MorCodigo7A>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| codPostal4 |  ``` Required ```  | TODO: Add a parameter description |
| codPostal3 |  ``` Required ```  | TODO: Add a parameter description |
| localidade |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int codPostal4 = 9545;
int codPostal3 = 122;
String localidade = "Ponta Delgada";
// Invoking the API call with sample inputs
moradas.getMorErro2Async(codPostal4, codPostal3, localidade, new APICallBack<List<MorCodigo7A>>() {
    public void onSuccess(HttpContext context, List<MorCodigo7A> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 501 | Not Implemented |



[Back to List of Controllers](#list_of_controllers)

## <a name="codigos_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.CodigosController") CodigosController

### Get singleton instance

The singleton instance of the ``` CodigosController ``` class can be accessed from the API Client.

```java
CodigosController codigos = client.getCodigos();
```

### <a name="get_cod_todos_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.CodigosController.getCodTodosAsync") getCodTodosAsync

> Obter todos os códigos postais.


```java
void getCodTodosAsync(final APICallBack<List<Geral>> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
codigos.getCodTodosAsync(new APICallBack<List<Geral>>() {
    public void onSuccess(HttpContext context, List<Geral> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_cod_por_dist_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.CodigosController.getCodPorDistAsync") getCodPorDistAsync

> Obter os códigos postais para um distrito.


```java
void getCodPorDistAsync(
        final String designacaoDistrito,
        final APICallBack<List<Distrito>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| designacaoDistrito |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String designacaoDistrito = "Lisboa";
// Invoking the API call with sample inputs
codigos.getCodPorDistAsync(designacaoDistrito, new APICallBack<List<Distrito>>() {
    public void onSuccess(HttpContext context, List<Distrito> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_cod_por_con_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.CodigosController.getCodPorConAsync") getCodPorConAsync

> Obter os códigos postais para um concelho.


```java
void getCodPorConAsync(
        final String designacaoConcelho,
        final APICallBack<List<CodigosConcelho>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| designacaoConcelho |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String designacaoConcelho = "Ponta Delgada";
// Invoking the API call with sample inputs
codigos.getCodPorConAsync(designacaoConcelho, new APICallBack<List<CodigosConcelho>>() {
    public void onSuccess(HttpContext context, List<CodigosConcelho> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_cod_por_loc_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.CodigosController.getCodPorLocAsync") getCodPorLocAsync

> Obter os códigos postais para uma localidade.


```java
void getCodPorLocAsync(
        final String localidade,
        final APICallBack<List<CodigosLocalidade>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| localidade |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String localidade = "Capelas";
// Invoking the API call with sample inputs
codigos.getCodPorLocAsync(localidade, new APICallBack<List<CodigosLocalidade>>() {
    public void onSuccess(HttpContext context, List<CodigosLocalidade> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_cod_por_rua_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.CodigosController.getCodPorRuaAsync") getCodPorRuaAsync

> Obter os códigos postais para um arruamento.


```java
void getCodPorRuaAsync(
        final String arruamento,
        final APICallBack<List<CodPorRua1>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| arruamento |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String arruamento = "Ramal Novo";
// Invoking the API call with sample inputs
codigos.getCodPorRuaAsync(arruamento, new APICallBack<List<CodPorRua1>>() {
    public void onSuccess(HttpContext context, List<CodPorRua1> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_cod_combo_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.CodigosController.getCodComboAsync") getCodComboAsync

> Obter os códigos postais que se enquadram na combinação dos parâmetros passados.


```java
void getCodComboAsync(
        final String designacaoConcelho,
        final String localidade,
        final String arruamento,
        final APICallBack<List<CodigosCombinar>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| designacaoConcelho |  ``` Required ```  | TODO: Add a parameter description |
| localidade |  ``` Required ```  | TODO: Add a parameter description |
| arruamento |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String designacaoConcelho = "Ponta Delgada";
String localidade = "Santo António";
String arruamento = "Ra_al%";
// Invoking the API call with sample inputs
codigos.getCodComboAsync(designacaoConcelho, localidade, arruamento, new APICallBack<List<CodigosCombinar>>() {
    public void onSuccess(HttpContext context, List<CodigosCombinar> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_cod_combo_all_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.CodigosController.getCodComboAllAsync") getCodComboAllAsync

> Obter os códigos postais que se enquadram na combinação dos parâmetros passados. Este exemplo mostra todos os parâmetros.


```java
void getCodComboAllAsync(
        final String designacaoDistrito,
        final String designacaoConcelho,
        final int codPostal4,
        final int codPostal3,
        final String localidade,
        final String arruamento,
        final APICallBack<List<CodComboAll1>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| designacaoDistrito |  ``` Required ```  | TODO: Add a parameter description |
| designacaoConcelho |  ``` Required ```  | TODO: Add a parameter description |
| codPostal4 |  ``` Required ```  | TODO: Add a parameter description |
| codPostal3 |  ``` Required ```  | TODO: Add a parameter description |
| localidade |  ``` Required ```  | TODO: Add a parameter description |
| arruamento |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String designacaoDistrito = "Ilha de São Miguel";
String designacaoConcelho = "Ponta Delgada";
int codPostal4 = 9545;
int codPostal3 = 122;
String localidade = "Capelas";
String arruamento = "Cruz da Pedra";
// Invoking the API call with sample inputs
codigos.getCodComboAllAsync(designacaoDistrito, designacaoConcelho, codPostal4, codPostal3, localidade, arruamento, new APICallBack<List<CodComboAll1>>() {
    public void onSuccess(HttpContext context, List<CodComboAll1> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_cod_erro1_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.CodigosController.getCodErro1Async") getCodErro1Async

> Erro. Parâmetros inválidos são:
> [ designacaoDistrito | designacaoConcelho | designacaoConcelho | codPostal4 | codPostal3 | localidade | arruamento ]


```java
void getCodErro1Async(
        final String nomeConcelho,
        final String localidades,
        final String nomedarua,
        final APICallBack<List<Combinar>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| nomeConcelho |  ``` Required ```  | TODO: Add a parameter description |
| localidades |  ``` Required ```  | TODO: Add a parameter description |
| nomedarua |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String nomeConcelho = "Ponta Delgada";
String localidades = "Santo António";
String nomedarua = "Ra_al%";
// Invoking the API call with sample inputs
codigos.getCodErro1Async(nomeConcelho, localidades, nomedarua, new APICallBack<List<Combinar>>() {
    public void onSuccess(HttpContext context, List<Combinar> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 404 | Not Found |



### <a name="get_cod_erro2_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.CodigosController.getCodErro2Async") getCodErro2Async

> Erro. Parâmetros inválidos são:
> [ designacaoDistrito | designacaoConcelho | designacaoConcelho | codPostal4 | codPostal3 | localidade | arruamento ]


```java
void getCodErro2Async(
        final String casa,
        final String designacaoDistrito,
        final String designacaoConcelho,
        final int codPostal4,
        final int codPostal3,
        final String localidade,
        final String arruamento,
        final APICallBack<List<CodigosDistrito>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| casa |  ``` Required ```  | TODO: Add a parameter description |
| designacaoDistrito |  ``` Required ```  | TODO: Add a parameter description |
| designacaoConcelho |  ``` Required ```  | TODO: Add a parameter description |
| codPostal4 |  ``` Required ```  | TODO: Add a parameter description |
| codPostal3 |  ``` Required ```  | TODO: Add a parameter description |
| localidade |  ``` Required ```  | TODO: Add a parameter description |
| arruamento |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String casa = "grande";
String designacaoDistrito = "Ilha de São Miguel";
String designacaoConcelho = "Ponta Delgada";
int codPostal4 = 9545;
int codPostal3 = 122;
String localidade = "Capelas";
String arruamento = "Cruz da Pedra";
// Invoking the API call with sample inputs
codigos.getCodErro2Async(casa, designacaoDistrito, designacaoConcelho, codPostal4, codPostal3, localidade, arruamento, new APICallBack<List<CodigosDistrito>>() {
    public void onSuccess(HttpContext context, List<CodigosDistrito> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 501 | Not Implemented |



[Back to List of Controllers](#list_of_controllers)

## <a name="misc_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.MiscController") MiscController

### Get singleton instance

The singleton instance of the ``` MiscController ``` class can be accessed from the API Client.

```java
MiscController misc = client.getMisc();
```

### <a name="get_home_erro_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.MiscController.getHomeErroAsync") getHomeErroAsync

> Erro. Endpoints válidos: [ distritos | concelhos | moradas | codigos ]


```java
void getHomeErroAsync(final APICallBack<Object> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
misc.getHomeErroAsync(new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 404 | Not Found |



[Back to List of Controllers](#list_of_controllers)



