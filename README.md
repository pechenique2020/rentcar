# Caixa Java Challenge - Rentcar

## Estructura del proyecto

Proyecto Maven por módulos

- application
- bootloader
- domain (api, common, model, spi)
- infrastructure

Explicación:

* En el módulo application están todos aquellos actores primarios que hacen que se ejecute la lógica de negocio para rentcar, es decir, un API Rest en este caso. Este módulo hará uso de las interfaces de servicio definidas en la capa de dominio.

* El módulo bootloader contiene la clase que permite ejecutar el proyecto SpringBoot.

* El módulo domain contiene toda la lógica de negocio y está totalmente aislado del resto de módulos. Expone su funcionalidad mediante interfaces de servicio que usará la capa de aplicación y puertos que son "adaptados" por la capa de infraestructura". **Es completamente agnóstico de la forma y con qué se llevan a cabo las implementaciones de los puertos**.

* El módulo infrastructure contiene toda la conectividad al sistema de persistemcia H2 Database, la cual es ejecutada desde los servicios de la capa de dominio mediante los adaptadores que se implementan los puertos expuestos por ésta.

## Swagger

Para interactuar con el dominio existe un swagger que se ha generado automáticamente a partir del ficheros de especificación de OpenApi. Se encuentra accesible desde la ruta:

http://localhost:8082/swagger-ui/index.html

## Funcionalidades desarrolladas

- Pre-carga del inventario de vehiculos
- Dar de alta a un nuevo cliente
- Registrar una o varias solicitudes de alquiler de vehiculos y consultarlas
- Registrar la entrega de un vehiculo reviamente alquilado
- Consultar las métricas de lealtad e historíco de préstamo de un cliente

Explicación:
 
* Al iniciar la ejecución del proyecto se precargaran 100 vehiculos de los tres tipos previstos (PREMIUN, SUV, SMALL) con la siguiente secuencia de placas: (5001-JYL ... 5100-JYL). Los endpoints para interaccionar con dicho inventario son los correspondientes al tag (inventory)

* Se crearán dor registros de clientes ficticios con los DNI 99999999V y 77777777H. Igualmente se pueden incuir nuevos clientes a través del endpoint (**POST**) /client    

* Para dar de alta solicitudes de alquiler vehiculos se debe utilizar el enpoint (**POST**) /rentcar. También se puede consultar una orden de alquiler a través de Id otorgado.

* Se podrán gestionar las entregas de los vehiculos alquilados a través del endpoint (**POST**) /rentcar/return .

* Se dispone del endpoint (**GET**) /client/{client_dni} para consultar las métricas de lealtad e histórico de ordenes asociadas a un cliente en particular

## Requisitos

**Se recomienda la instalación de Sdkman en linux para poder intercambiar facilmente entre las distintas versiones de java que tengamos instaladas.**

* JDK 16
* Maven 3.8.x
* Nota: Si necesitáis ejecutar el proyecto en modo debug no olvidar instalar lombok en [Eclipse](https://projectlombok.org/setup/eclipse) / [IntelliJ](https://projectlombok.org/setup/intellij)
