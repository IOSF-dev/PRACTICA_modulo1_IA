Perfecto. Como ya tienes el código funcional en Python y Java, te genero ahora:

1. 📄 `README.md`
2. 📋 `pseudocodigo.md`
3. 🧭 `diagrama-clases.png` (especificación de generación con IA)
4. 🗃️ Comandos para crear el repositorio Git con ramas por operación

---

## ✅ 1. `README.md` (para ambos lenguajes)

````markdown
# Mini-Calculadora CLI

Este proyecto implementa una calculadora de línea de comandos en dos versiones: Python y Java. Permite realizar operaciones aritméticas básicas entre dos números.

## 📦 Operaciones soportadas

- `add`: Suma
- `sub`: Resta
- `mul`: Multiplicación
- `div`: División (con control de división por cero)
- `pow`: Potencia

## 🐍 Versión Python

### Ejecutar:

```bash
python calc.py <operacion> <a> <b>
````

Ejemplo:

```bash
python calc.py add 2 3
```

### Tests:

```bash
python -m pytest tests/test_core.py
```

## ☕ Versión Java

### Ejecutar:

```bash
java -cp src CalculatorApp
```

### Tests (con Maven):

```bash
mvn test
```

## 🧪 Requisitos funcionales

| Código | Requisito                          |
| ------ | ---------------------------------- |
| RF‑01  | Soporta operaciones básicas        |
| RF‑02  | Valida entradas numéricas          |
| RF‑03  | Controla división por cero         |
| RF‑04  | Admite extensiones (como potencia) |

---

## 🔧 Instalación de dependencias

* Python: `pytest`
* Java: JUnit 4 (incluido en `pom.xml`)

---

## 📁 Estructura del proyecto

```
mini-calculadora-cli/
├── python/
│   ├── core.py
│   ├── calc.py
│   └── tests/
│       └── test_core.py
├── java/
│   ├── src/
│   │   ├── Calculator.java
│   │   └── CalculatorApp.java
│   └── test/
│       └── CalculatorTest.java
├── docs/
│   ├── pseudocodigo.md
│   └── diagrama-clases.png
├── README.md
└── .gitignore
```

````

---

## ✅ 2. `pseudocodigo.md`

```markdown
# Pseudocódigo — Mini-Calculadora CLI

## Entrada:
- Operación (texto): "+", "-", "*", "/", "^"
- Dos números (a, b)

## Proceso:

1. Leer la operación.
2. Leer el primer número (a).
3. Leer el segundo número (b).
4. Validar que los datos son numéricos.
5. Según la operación:
   - "+" → resultado = a + b
   - "-" → resultado = a - b
   - "*" → resultado = a * b
   - "/" → si b ≠ 0 entonces resultado = a / b, si no error
   - "^" → resultado = a elevado a b
6. Imprimir el resultado o mensaje de error.

## Salida:
- Resultado de la operación o error de entrada/división por cero.
````

---

## ✅ 3. Imagen para el diagrama UML

### 🧠 Contenido de la imagen `diagrama-clases.png`

```text
Archivo | Prompt corto
--------|--------------
img01_diagrama-clases.png | UML class diagram with classes: Calculator (method: calcular) and CalculatorApp (method: main), using CLI interaction
```

---

## ✅ 4. Comandos Git recomendados

```bash
git init
git add .
git commit -m "Init: estructura base del proyecto"

# Crear ramas para cada operación
git checkout -b feature/add
# Implementar y hacer commit
git checkout main
git merge feature/add
git branch -d feature/add

# Repetir con sub, mul, div, pow
```