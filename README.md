# relis-statistical-classification

## 🔍 Overview

This repository extends the basic statistical classification capabilities of *[ReLiS](https://github.com/geodes-sms/relis)* : a tool for conducting systematic reviews, develop by the [GEODES](https://geodes.iro.umontreal.ca/) software engineering group at the [University of Montreal](https://www.umontreal.ca/en/).

It provides to the users a *Domain specific language* (DSL) to create custom analytical protocol models based on their *ReLiS* project classification metadata.
These protocol models are then used to automatically generate Python code. When executed, this code produces analytical reports detailing the classification data of the relis project.

**Primary authors:** Louis Lalonde [@louislalonde](https://github.com/LouisLalonde) and Hanz Schepens [@Wickkawizz](https://github.com/Wickkawizz)

## Repositories

- [DSL](https://github.com/LouisLalonde/relis-statistical-classification)
- [Statistical-Templates](https://github.com/LouisLalonde/relis-statistical-templates)
- [Classifiers-Injector](https://github.com/LouisLalonde/relis-classifiers-injector)

## 🚀 Roadmap 
- [x] DSL metamodel with ecore
- [x] *ReLIS* database project classfication data extraction  
- [x] R statistic functions migration to Python
- [ ] Python executable artifacts autogeneration from [Twig](https://twig.symfony.com/) templates

## 📜 Supported statistical function by categories

| Statistics category | Name | Variable type | Description | Migrated to Python |
|----|----|----|----|----|
| ``Descriptive`` | Frequency tables | Nominal | | Yes |
| `Descriptive` | Bar plots | Nominal | | Yes |
| `Descriptive` | Statistics | Continuous | | Yes |
| `Descriptive` | Box plots | Continuous | | Yes |
| `Descriptive` | Violin plots | Continuous | | Yes |
| `Evolution` | Frequency tables | Nominal | | Yes |
| `Evolution` | Evolution plots | Nominal | | Yes |
| ``Comparative`` | Frequency tables | Nominal | | Yes |
| `Comparative` | Stacked bar plots | Nominal | | Yes |
| `Comparative` | Grouped bar plots | Nominal | | Yes |
| `Comparative` | Bubble charts | Nominal | | Yes |
| `Comparative` | Fisher's exact test | Nominal | | Yes |
| `Comparative` | Shapiro Wilk's correlation test | Continuous | | Yes |
| `Comparative` | Pearson's correlation test | Continuous | | Yes |
| `Comparative` | Spearman's correlation test | Continuous | | Yes |
