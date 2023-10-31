# relis-statistical-classification

## 🔍 Overview

This repository extends the basic statistical classification capabilities of *ReLiS*: a tool for conducting systematic reviews, develop by the [GEODES](https://geodes.iro.umontreal.ca/) software engineering group at the [University of Montreal](https://www.umontreal.ca/en/).

It provides to the users a *Domain specific language* (DSL) to create custom analytical protocol models based on their *ReLiS* project classification metadata.
These protocol models are then used to automatically generate Python code. When executed, this code produces analytical reports detailing the classification data of the relis project.

**Primary authors:** Louis Lalonde [@louislalonde](https://github.com/LouisLalonde) and Hanz Schepens [@Wickkawizz](https://github.com/Wickkawizz)

## 🚀 Roadmap 
- [x] DSL metamodel with ecore
- [ ] DSL grammar with xtext
- [ ] DSL *ReLIS* project classification variables injector
- [ ] R statisctics functions migration to Python
- [ ] DSL statistics code generation to python with xtend

## 📜 Supported statistical function by categories

| Statistics category | Name | Variable type | Description | Migrated to Python |
|----|----|----|----|----|
| ``Descriptive`` | Frequency tables | Nominal | | No |
| `Descriptive` | Bar plots | Nominal | | No |
| `Descriptive` | Statistics | Continuous | | No |
| `Descriptive` | Box plots | Continuous | | No |
| `Descriptive` | Violin plots | Continuous | | No |
| `Evolution` | Frequency tables | Nominal | | No |
| `Evolution` | Evolution plots | Nominal | | No |
| ``Comparative`` | Frequency tables | Nominal | | No |
| `Comparative` | Stacked bar plots | Nominal | | No |
| `Comparative` | Grouped bar plots | Nominal | | No |
| `Comparative` | Bubble charts | Nominal | | No |
| `Comparative` | Fisher's exact test | Nominal | | No |
| `Comparative` | Shapiro Wilk's correlation test | Continuous | | No |
| `Comparative` | Pearson's correlation test | Continuous | | No |
| `Comparative` | Spearman's correlation test | Continuous | | No |
