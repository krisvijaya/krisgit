Feature:Login
@Smoketest
Scenario:validate login operation
Given launching site using "chrome"
Then title test "free sms"
And close site

Scenario Outline:validate login operation
Given launch site using "chrome"
When enter mobile number as"<x>"
And enter password as"<y>"
And click login
Then validate criteria as"<z>"
And close site

Examples:
|     x    |   y   |   z      |
|8341111338|oiuytrd|all_valid |
|          |iuyhgfd|blank_mbno|