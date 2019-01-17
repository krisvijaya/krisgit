Feature:Login
Scenario : validate site launcing
Given : launch site using "Chrome"
Then Tittle contain "free sms"
And close site

Scenario Outline : validate login operation
Given launch site using "chrome"
When enter mobile number as "<x>"
And enter password as "<y>"
And click login
Then validate output criteria as "<z>"
And close site

Example:
| x        | y       | z         |
|8668218023|Preeti123|All_valid  |
|          |Preeti123|Blank_mobno|
|8668218023|         |Blank_pwd  |
|8668218024|Preeti123|Mob_invalid|
|8668218023|Preeti234|Psw_invalid|
