# python/core.py
from enum import Enum

class Operation(str, Enum):
    ADD = "add"
    SUB = "sub"
    MUL = "mul"
    DIV = "div"
    POW = "pow"

def calculate(op: Operation, a: float, b: float) -> float:
    if op == Operation.ADD:
        return a + b
    elif op == Operation.SUB:
        return a - b
    elif op == Operation.MUL:
        return a * b
    elif op == Operation.DIV:
        if b == 0:
            raise ZeroDivisionError("División por cero")
        return a / b
    elif op == Operation.POW:
        return a ** b
    else:
        raise ValueError(f"Operación no soportada: {op}")
