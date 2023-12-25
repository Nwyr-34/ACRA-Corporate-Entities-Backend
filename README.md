# ACRA-Corporate-Entities-Backend
Backend para la aplicación CRUD que maneja los datos de las entidades corporativas registradas en la Autoridad Reguladora de Empresas y Contabilidad (ACRA) de Singapur.

Este proyecto es una aplicación de muestra mínima utilizando **Spring Boot** versión 3.2.0 junto la versión 17 de **Java**. A continuación, se detallan los requisitos y cómo ejecutar la aplicación localmente.

## Requisitos mínimos

Para compilar y ejecutar la aplicación, necesitas lo siguiente:

1. **JDK 1.8**: Tener instalado Java Development Kit (JDK) versión 1.8 o superior.
2. **Maven 3**: Para compilar y gestionar las dependencias del proyecto.

## Configuración de la base de datos

Antes de ejecutar la aplicación, necesitarás configurar las credenciales de la base de datos. Sigue estos pasos:

1. Navega al archivo de propiedades de la aplicación (usualmente ubicado en `src/main/resources/application.properties`).
2. Busca las siguientes propiedades y reemplázalas con tus propiedades de la base de datos:
    - `spring.datasource.url`: La URL de tu base de datos, por ejemplo (`jdbc:mysql://localhost:3306/tu_base_de_datos`).
    - `spring.datasource.username`: El nombre de usuario de tu base de datos.
    - `spring.datasource.password`: La contraseña de tu base de datos.

Asegurarse de no subir sus credenciales de la base de datos al repositorio de código.

## Ejecución local

A continaución se muestra 2 opciones para ejecutar la aplicación Spring Boot en su máquina local:

1. **Desde la línea de comandos**:
   - Clonar este repositorio: `git clone https://github.com/Nwyr-34/ACRA-Corporate-Entities-Backend.git`
   - Navegar al directorio del proyecto: `cd ACRA-Corporate-Entities-Backend`
   - Ejecutar la aplicación: `mvn spring-boot:run`

2. **Desde un IDE (eg.IntelliJ)**:
   - Importar el proyecto como un proyecto Maven existente.
   - Ejecutar la clase principal `Application` como una aplicación Java.

## Importación de datos

Después de ejecutar la aplicación, se debe importar los datos desde el archivo `tb_corporate_entities.csv`. 

Seguir el tutorial [aquí](https://learnsql.com/blog/import-csv-mysql-database/) para importar los datos a su base de datos MySQL. Es importante seleccionar la opción para usar una tabla existente, ya que la aplicación backend la crea primero.

> ![Importing data in mysql](https://cdn.discordapp.com/attachments/1146191439177453601/1188777816439918602/image.png?ex=659bc29d&is=65894d9d&hm=27cdfa731ec8fffa8b205c09da3ad2893eb72ba6a9a43f234871e714a3ac1e16&)

## Documentación

Para consultar o verificar el funcionamiento correcto del backend, acceder a la documentación en el siguiente enlace: [OpenApi - Documentación Swagger](http://localhost:8080/swagger-ui/index.html)

Recordar que se debe tener la aplicación en ejecución localmente para acceder a la documentación.

## Visualización completa de la aplicación

Una vez que el backend esté corriendo y visualizándose correctamente, ir al repositorio del frontend para ver la aplicación CRUD completa a través del siguiente enlace

> [ACRA Corporate Entities Frontend](https://github.com/Nwyr-34/ACRA-Corporate-Entities-Frontend)