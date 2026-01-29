from typing import Optional, List
import sys
from core import calculate, Operation

def main(argv: Optional[List[str]] = None) -> None:
    if argv is None:
        argv = sys.argv[1:]

    if len(argv) != 3:
        print("Uso: calc.py <operacion> <a> <b>")
        print("Operaciones: add, sub, mul, div, pow")
        sys.exit(1)

    op_str, a_str, b_str = argv

    try:
        op = Operation(op_str)
        a = float(a_str)
        b = float(b_str)
        result = calculate(op, a, b)
        print(f"Resultado: {result}")
    except ValueError as ve:
        print(f"Error: {ve}")
        sys.exit(2)
    except ZeroDivisionError as zde:
        print(f"Error: {zde}")
        sys.exit(3)

if __name__ == "__main__":
    main()
 #merge add
 #merge sub
 #merge mul
 #merge div