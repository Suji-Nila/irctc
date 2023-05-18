Feature: login feature
Background:
Given I am fromNyka page Scenarios
Given I launch the application
When I clicked on search area
And I entered the product name
And i selected the data from  the suggestions
Then I verified that search result

Scenario: Serach the nyka website withoutclicking on search field
Given I launch the application
And I entered the product name
And I selected the data from the suggestions
Then I verified that search the result