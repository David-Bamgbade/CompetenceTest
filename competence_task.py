import math


def divideBy5(input_number):
    if input_number % 5 == 0:
        return math.isqrt(input_number)


def future_investment(investment_amount, interest_rate, number_of_months):
    hundred_percent = 100
    monthly_interest_rate = interest_rate / number_of_months
    interest_calculation = monthly_interest_rate * number_of_months
    return_on_investment = (interest_calculation / hundred_percent) * investment_amount
    final_returns = return_on_investment + investment_amount
    return final_returns


def only_floats(number1, number2):
    if number1 % 2 != 0 and number2 % 2 != 0:
        return 2
    elif number1 % 2 != 0 or number2 % 2 != 0:
        return 1
    else:
        return 0


def myDiscount(price, discount):
    hundred_percent = 100
    discount_price = (price / hundred_percent) * discount
    price_after_discount = price - discount_price
    return price_after_discount
