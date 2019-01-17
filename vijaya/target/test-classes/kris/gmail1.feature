Feature:Login
@smoketest
Scenario:validate site launching
Given launch site using "chrome"
Then title contains "gmail"
And close site
Scenario Outline:validate login operation
Given launch site using "chrome"
When enter gmail userid as"<x>"
And click next
And enter gmail password as "<y>"
And click next
Then validate criteria "<z>"
And close site
Examples:
|     x    |    y       |   z        |
|8341111338|ilovemom147@|ALL_VALID   |
|8341111337|ilovemom147@|MBNO_INVALID|
|8341111338|ilovemom147$|PWD_INVALID | 