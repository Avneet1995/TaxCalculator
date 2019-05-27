# TaxCalculator
A standalone java program that accepts items details and calculate the effective cost after applying the tax rules.
Input
1. Item name 2. Item type 3.Item price 4.Item quantity
---------------------------------------------------------------------------
Input should be accepted with following command line options:
-name <first item name>
-price <price of first item>
-quantity <quantity of first item>
-type <type of first item>
---------------------------------------------------------------------------
Business Rules
Item type can have 3 possible values Raw, Manufactured and Imported and tax rules for 3 types are as follows:
 Raw: 12.5% of the item cost
 Manufactured: 12.5% of the item cost + 2% of (item cost + 12.5% of item cost)
 Imported: 10% import duty on item cost + a surcharge (surcharge is: Rs. 5 if the final cost after applying tax
& import duty is up to Rs. 100, Rs. 10 if the cost exceeds 100 and up to 200 and 5% of the final cost if it
exceeds 200).
