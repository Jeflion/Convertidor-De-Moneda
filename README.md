# Convertidor-De-Moneda
Este proyecto es un convertidor de divisas implementado en Java utilizando la clase HttpClient para realizar solicitudes a una API de tasas de cambio. El programa permite convertir montos entre diferentes monedas, obteniendo la tasa de cambio actualizada en tiempo real. 

Características
-Conversión de divisas entre peso argentino, dólar, real brasileño, euro y peso colombiano.
-Obtención de tasas de cambio en tiempo real desde una API.
-Sistema de menú interactivo para seleccionar la moneda de origen y destino.
-Uso de la clase HttpClient, HttpRequest y HttpResponse para hacer las solicitudes HTTP.
-Implementación de constructores y métodos getter/setter para una mejor estructuración y mantenimiento del código.

Tecnologías utilizadas
Java 11+: Para la implementación de la lógica del programa.
API de tasas de cambio: Para obtener los valores de conversión actualizados en tiempo real.
HttpClient: Para hacer la solicitud HTTP a la API.
JSONObject: Para manejar la respuesta de la API en forma

Estructura del Proyecto
El proyecto está dividido en varias clases principales que ayudan a modularizar el código para hacerlo más entendible y fácil de mantener. A continuación, se describe la estructura y el proceso de construcción:

1. Clase ConversorDivisas
Esta es la clase principal del proyecto donde se encuentra la lógica del menú y las conversiones. Se encarga de:

Mostrar un menú interactivo en la consola con las diferentes opciones de conversión.
Recibir la entrada del usuario y validar si la opción seleccionada es válida.
Llamar a la API para obtener las tasas de cambio y realizar la conversión.
2. Uso de HttpClient, HttpRequest y HttpResponse
Para interactuar con la API de tasas de cambio, empleamos las clases de la librería java.net:

HttpClient: Permite realizar solicitudes HTTP asíncronas y síncronas.
HttpRequest: Aquí configuramos el tipo de solicitud (GET), la URL de la API y los parámetros que necesitamos.
HttpResponse: Una vez realizada la solicitud, se obtiene la respuesta, la cual analizamos en formato JSON para extraer la tasa de cambio.
3. Clase Moneda
Esta clase encapsula las propiedades y funciones relacionadas con las diferentes monedas. Tiene:

Constructores: Para inicializar una moneda con su nombre y tasa de cambio.
Getters y Setters: Para acceder y modificar los valores de las tasas de cambio.
4. Uso de la API
La API utilizada para obtener las tasas de cambio proporciona las conversiones en formato JSON. En el proyecto, usamos la clase JSONObject para analizar la respuesta y extraer las tasas de cambio correspondientes.

5. Manejo de Excepciones
El proyecto incluye un manejo adecuado de errores y excepciones para situaciones como:

Fallos en la conexión a la API.
Monedas no válidas ingresadas por el usuario.
Tasas de cambio no disponibles.



PRIMERO SE CREAN LAS CARPETAS PARA IDENTIFICAR EL CODIGO

![image](https://github.com/user-attachments/assets/27ef298e-1d48-4375-b995-fd998974e62b)

SEGUNDO SE CREAN LAS CLASES DE JAVA

![image](https://github.com/user-attachments/assets/898fdf17-f68d-44c1-8454-f60f7fd8150d)

TERCERO SE CREA UNA CUENTA PARA LA API RECOMENDADA PARA EL CONVERTIDOR

![image](https://github.com/user-attachments/assets/c7fb54be-9933-4b1d-aba8-01dc7906295f)

CUARTO SE GENERA EL CODIGO PARA LA CLASE PRINCIPAL 

![image](https://github.com/user-attachments/assets/dbc8c9e3-1434-43c2-aba8-d68722ffd3f3)

QUINTO EN LA CLASE DE CONVERTIDOR SE VALIDA Y VERIFICA LA API PARA QUE ESTA FUNCIONE CORRECTAMENTE

![image](https://github.com/user-attachments/assets/871d84e9-3225-41b7-b882-46b9b1ff3ddf)

SEXTO SE GENERA EL CODIGO PARA EL MENU DEL USUARIO

![image](https://github.com/user-attachments/assets/37b3f966-75ab-47fc-9a46-1880fb048c28)

SEPTIMO SE GENERA EL CODIGO CON LA ELECCION DEL USUARIO

![image](https://github.com/user-attachments/assets/3a5bb42f-f08f-4243-9ab7-98fcbc15a350)

OCTAVO SE GENERA UNA OPCION SI LA ELECCION DEL USUARIO NO SE ENCUENTRA EN LA LISTA Y SE CIERRA EL MENU

![image](https://github.com/user-attachments/assets/ae8fd6c1-5ea6-44e2-9bb7-d6969a5ec2d8)

NOVENO SE CONTINUA CON EL CODIGO EN LA CLASE CONVERTIDOR DEL CUAL SERA LA QUE NOS UNE A LA "API" Y SE ENCARGA DE LA LOGICA

![image](https://github.com/user-attachments/assets/d0e66ca1-8dc9-466d-a495-541c7ed52ca2)

DECIMO SE COMPARTE COMO QUEDO EL CODIGO

![image](https://github.com/user-attachments/assets/68d1caaa-14b0-4d5e-8612-b4ba7a111ec9)

ULTIMO PUNTO SE REALIZA PRUEBA DEL CUAL SE CONFIRMA LA FUNCIONALIDAD DEL PROYECTO 

![image](https://github.com/user-attachments/assets/1a80a53d-a767-4534-abf4-74e6b6dd48b4)











