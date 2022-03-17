Feature: In amimantion hiding of buttons 
 
 @test1
Scenario: User is in the homepage of the app
        Given user is in the homepage
        When user click on the animation button
        And after that user click on the hide-show animation
        And user click on the hide check box 
        Then click on the numbers to hide them 
 
 @test2
 Scenario: user is in the hide-show animation page
        When user click the animation
        And after that click hideshow
         And user click on the numbers to hide them
         And user then click on showbuttons 
         Then it will display all the buttons again