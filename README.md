Este proyecto es una aplicación en Java que permite realizar conversiones de divisas entre varias monedas. 
Utiliza una API externa para obtener las tasas de cambio actualizadas y facilita la conversión de montos entre 
diferentes tipos de monedas de forma interactiva a través de un menú.

Uso
Al ejecutar el programa, se mostrará un menú en la consola.
Selecciona una opción de conversión entre las divisas disponibles.
Ingresa el monto a convertir y el programa realizará la solicitud a la API, mostrando el resultado en pantalla.

Clases Principales

Principal
La clase Principal controla la lógica de la interfaz de usuario. Presenta un menú para que el usuario seleccione las divisas y el monto que desea convertir.

ObtenerTasaParMonedas
Esta clase es responsable de realizar la solicitud HTTP a la API de cambio de divisas y procesar la respuesta JSON. 
Utiliza la biblioteca Gson para deserializar la respuesta en un objeto TasaCambio.

TasaCambio
La clase TasaCambio representa el resultado de la conversión, con los campos:

base_code: La moneda de origen

target_code: La moneda de destino

conversion_rate: La tasa de cambio

conversion_result: El resultado de la conversión

API Externa
Este proyecto utiliza la ExchangeRate-API para obtener datos de cambio de divisas en tiempo real. Debes contar con una clave API válida para usar el servicio.

Ejemplo de Salida
*********************************************
    Bienvenido al conversor de Moneda

1) Dolar.............===>>> Peso Argentino
2) Peso Argentino....===>>> Dolar
3) Dolar.............===>>> Real Brasileño
4) Real Brasileño....===>>> Dolar
5) Dolar.............===>>> Peso Chileno
6) Peso Chileno......===>>> Dolar
7) Salir
*********************************************
Elija una opcion válida: 

Ingrese Monto a convertir: 100

========================================================
                    Conversión Final
                    ++++++++++++++++

Cambiar de: [USD] a: [ARS]
Tasa de conversión: 990.75
100 [USD] equivalen a: 99075.0 [ARS]

=======================================================
Créditos
Este proyecto fue desarrollado usando Java y la biblioteca Gson para manejar JSON.
API utilizada: ExchangeRate-API
¡Gracias por utilizar el Conversor de Monedas! Esperamos que sea de utilidad.
