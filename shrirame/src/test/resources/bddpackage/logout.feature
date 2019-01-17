Feature: Logout
Scenario : validate logout operation
given : Launch site using "chrome"
When do login with valid data
|mobno     |pwd      |
|8668218023|Preeti123|
And do logout
Then home page will be responed
And close site
