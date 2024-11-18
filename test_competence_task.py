from unittest import TestCase

import competence_task


class TestDivide(TestCase):

    def test_divide_by5_method(self):
        self.assertEqual(competence_task.divideBy5(10), 3)

    def test_divide_by5_method_for_error(self):
        self.assertIsNot(competence_task.divideBy5(10), 5)

    def test_investment_method(self):
        self.assertEqual(competence_task.future_investment(1000, 12, 12), 1120)

    def test_onlyFloat_method(self):
        self.assertEqual(competence_task.only_floats(4, 6), 0)

    def test_discount_method(self):
        self.assertEqual(competence_task.myDiscount(1000, 10), 900)


