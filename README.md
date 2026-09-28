# SDP-Asignment-2
SDP Assignment 2 — PC Factory (Abstract Factory + Factory Method)
1. Domain

PC assembly. The program builds a PC configuration from components and calculates its total power consumption, performance score and whether the cooling is balanced with the CPU.

2. Products (3)
Product	Interface	Methods
CPU	CPU	getName(), getPowerConsumption(), getPerformance()
GPU	GPU	getName(), getPowerConsumption(), getPerformance()
Cooling	Cooling	getName(), getPowerConsumption(), getCoolingPerformance()
3. Families (4)
Family	CPU (W / perf)	GPU (W / perf)	Cooling (W / perf)
Budget	65 / 50	100 / 50	30 / 50
Gaming	125 / 90	250 / 90	60 / 90
Professional	180 / 100	350 / 100	80 / 100
Extreme	250 / 100	450 / 100	100 / 100

Each family has its own factory (BudgetPCFactory, GamingPCFactory, ProfessionalPCFactory, ExtremePCFactory) and its own concrete classes for every product (e.g. GamingCPU, GamingGPU, GamingCooling).

4. Where is Abstract Factory

Package com.example.pcfactory.factories and com.example.pcfactory.products.

Abstract factory: PCFactory with createCPU(), createGPU(), createCooling().
Concrete factories: BudgetPCFactory, GamingPCFactory, ProfessionalPCFactory, ExtremePCFactory.
Abstract products: CPU, GPU, Cooling.
Concrete products: 12 classes (4 families x 3 products).
Client: PCConfiguration (business logic) and PCClient. They depend only on PCFactory and the product interfaces, never on concrete classes.
5. Where is Factory Method

Package com.example.pcfactory.factorymethod.

Creator: ComputerCreator (abstract) declares the factory method createComputer() and uses it in prepareComputer().
Concrete creators: BudgetComputerCreator, GamingComputerCreator, ProfessionalComputerCreator — each overrides createComputer().
Product interface: Computer with build().
Concrete products: BudgetComputer, GamingComputer, ProfessionalComputer.

This package is a standalone demonstration of the pattern: the subclass decides which Computer is created, while prepareComputer() stays the same. It is not used by Main, which runs the Abstract Factory flow.

6. Runtime selection

Main reads the family name from the first command-line argument (default: gaming) and passes it to PCFactorySelector.selectFactory(String), which returns the matching PCFactory:

"budget" | "gaming" | "professional" | "extreme"  ->  concrete PCFactory
anything else                                      ->  IllegalArgumentException

The name is case-insensitive. The chosen factory is passed to PCClient.buildPC(factory), which creates a PCConfiguration and prints its summary. The client code does not change when the family changes; only the factory object differs.

7. Why the products are compatible
A factory creates the CPU, GPU and Cooling of one family only, so products from different families can never be mixed by the client.
PCConfiguration receives only a PCFactory and asks it for all three components; it has no way to pick components individually.
Within each family the performance levels match (Budget 50, Gaming 90, Professional/Extreme 100), so the cooling always keeps up with the CPU. PCConfiguration.isBalanced() checks this (coolingPerformance >= cpuPerformance).
8. Files changed when adding the Extreme family

Commit Add Extreme PC family with all product types.

Added (new files):

factories/ExtremePCFactory.java
products/cpu/ExtremeCPU.java
products/gpu/ExtremeGPU.java
products/cooling/ExtremeCooling.java

Modified:

selection/PCFactorySelector.java — one new case "extreme" branch.
selection/PCFactorySelectorTest.java — one new test for the Extreme factory.

Not changed: PCFactory, CPU, GPU, Cooling, PCConfiguration, PCClient, Main and the other families. This is the benefit of the pattern: a new family is added without touching existing client code.

9. How to run

Requirements: JDK 25 (set in pom.xml) and Maven.

bash
mvn compile
java -cp target/classes com.example.pcfactory.Main gaming

Replace gaming with budget, professional or extreme. Without an argument the gaming family is used.

Example output for gaming:

Building PC
CPU: Gaming CPU
GPU: Gaming GPU
Cooling: Gaming Cooling
Total power: 435 W
Performance score: 90
Balanced cooling: true
10. How to run tests
bash
mvn test

Tests (JUnit 5) are in src/test/java/com/example/pcfactory/:

factories/PCFactoryProductTest — factories create products of the right family.
selection/PCFactorySelectorTest — runtime selection and unknown-family error.
business/PCConfigurationBusinessTest — power and performance calculations.
business/PCConfigurationCompatibilityTest — balanced cooling for each family.
UML

Class diagrams are in docs/uml/.