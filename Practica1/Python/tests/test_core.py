# python/tests/test_core.py
import pytest
from core import calculate, Operation

def test_add():
    assert calculate(Operation.ADD, 2, 3) == 5

def test_sub():
    assert calculate(Operation.SUB, 5, 3) == 2

def test_mul():
    assert calculate(Operation.MUL, 2, 3) == 6

def test_div():
    assert calculate(Operation.DIV, 6, 2) == 3

def test_pow():
    assert calculate(Operation.POW, 2, 3) == 8

def test_div_by_zero():
    with pytest.raises(ZeroDivisionError):
        calculate(Operation.DIV, 1, 0)
