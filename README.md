# RestApp
The app accepts three endpoints:

1. GET on localhost:8080/status/ping 
Return „pong”.

2. POST on localhost:8080/numbers/sort-command 
After passing a list of numbers and sort type (ascending ASC or descending DESC) it returns the sorted list.

3. POST on localhost:8080/currencies/get-current-currency-value-command
After providing the currency code, it returns the current NBP average exchange rate from table A (http://api.nbp.pl/api/exchangerates/tables/A/)
