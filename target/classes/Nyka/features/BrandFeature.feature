Feature: Searching brand names
Background:
   Given Hello from brandsearch
@Brands
Scenarios: Search the Valid brand Names
Given I Launched the apllication
When I hovered over the brands tab
And I serached for ar valid Brand name
Then I Verified that brandname got selected successfully
@brands-invalid
Scenarios: Search invalid brand names
Given I Launched the application
When I hovered over the brands tab
And I serached for ar valid Brand name
Then I Verified that brandname got selected successfully
@ABC
Scenario:ABC
Given I on A
When I do B
Then I get C
