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
