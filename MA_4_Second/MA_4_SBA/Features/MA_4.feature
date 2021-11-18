Feature: Bounty Towels Page

Scenario: Essentials Select a size
	Given User launch Chrome browser and opens url "https://bountytowels.com/en-us"
	When user clicks on Essentials Select-A-Size on Footer
	Then verify if "Write a review" is present in Essentials Select-A-Size Page
	
