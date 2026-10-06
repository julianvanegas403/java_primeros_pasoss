# Taller Práctico - Java y Programación Orientada a Objetos

## 1. Comprueba que entendiste
* **¿Qué método inicia la ejecución de un programa Java?**
    * El método `public static void main(String[] args)`.

* **¿Qué diferencia observas entre String, int y boolean?**
    * `String` almacena cadenas de texto, `int` guarda números enteros y `boolean` maneja valores lógicos (`true` o `false`).

* **¿Qué instrucción usamos para imprimir en consola?**
    * `System.out.println()`.

---

## 2. Abstracción
* **¿Qué representa Estudiante y qué representa estudiante1?**
    * `Estudiante` representa la clase (el molde o plantilla general), mientras que `estudiante1` representa el objeto (la instancia concreta creada en memoria).

---

## 10. Preguntas de Cierre

1. **¿Por qué es mejor usar `private` para `nombre` y `edad` en vez de dejarlos `public`?**
    * Porque aplica el principio de encapsulamiento, protegiendo los datos para que no sean modificados de forma directa o indebida desde fuera de la clase y permitiendo validar los datos en los setters.

2. **¿Qué ventaja ofrece un constructor con parámetros?**
    * Permite inicializar un objeto con sus atributos cargados desde el mismo momento en que se instancia, reduciendo código y asegurando que el objeto nazca en un estado válido.

3. **¿Qué diferencia hay entre crear un objeto y crear una clase?**
    * Crear una clase es definir la estructura, atributos y métodos en el archivo de código, mientras que crear un objeto es reservar espacio en memoria usando la palabra clave `new` para usar esa estructura con datos reales.

4. **En el reto, ¿por qué Estudiante y Profesor heredan de Persona?**
    * Porque ambos comparten atributos (`nombre`, `edad`) y comportamientos (`presentarse()`) comunes, reutilizando código de la clase padre `Persona` mediante la herencia.

5. **¿Qué obliga a hacer un método abstracto en una clase hija?**
    * Obliga a la clase hija a proveer una implementación obligatoria de dicho método usando `@Override`.