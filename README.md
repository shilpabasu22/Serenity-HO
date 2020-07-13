# Candidate 1220780

This is the automation test built for Verifying the visa requirements for study and tourism visa for Japan and Russia

## Prerequisites
User must have:
1. Maven installed and set up on your machine.
2. Java 8 installed and setup on the machine

## Assumptions
This project has been built on following assumptions:
1. This project has been built on serenity-junit-starter.
2. Java8 has been used with Serenity.

##Project Structure
###Feature Files
There are 2 feature files in the project. These can be found under src/test/resources folder:
1. Postcode Query - To test the postcode functionality
2. visaValidation - To test the Visa requirements for Japan and Russia

### Step Definition
Step definition can be found under src/test/java/stepdefinitions folder

### Runner Classes
Runner classes for postcode api and visa validation can be found under src/test/java/runner folder

### Serenity reports
Serenity reports can be found under target/site/serenity folder

###serenity.conf
Serenity.conf file defines the configuration details for the project. It could be found under src/test/resources folder. Current properties define:
1. Test can be run in chrome. It could be changed to Firefox as the driver has been provided.
2. Tests can be run in headless mode, please change the property **headless.mode** to true
3. Drivers have been provided for Linux, Mac and Windows machines for both Chrome and Firefox browsers.

##Execution
Project can be executed using the command **mvn clean verify**

