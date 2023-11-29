# relis-statistical-classification

## 🔍 Overview

This repository extends the basic statistical classification capabilities of *[ReLiS](https://github.com/geodes-sms/relis)* : a tool for conducting systematic reviews, develop by the [GEODES](https://geodes.iro.umontreal.ca/) software engineering group at the [University of Montreal](https://www.umontreal.ca/en/).

It provides to the users a comprehensive Python environment to performs the statistical analysis of their *ReLiS* SR project classification data. 

It uses a *Domain Specific Modeling* approach (DSM), including a *Domain specific language* (DSL), to generate models from the *SR* project classification data.
These models are then used to automatically generate the executable artifacts of the Python environment.

**Primary authors:** Louis Lalonde [@louislalonde](https://github.com/LouisLalonde) and Hanz Schepens [@Wickkawizz](https://github.com/Wickkawizz)

## Repositories

- [DSL](https://github.com/LouisLalonde/relis-statistical-classification)
- [Environment](https://github.com/LouisLalonde/relis-statistical-templates)
- [Classifiers-Injector](https://github.com/LouisLalonde/relis-classifiers-injector)

## 🚀 Roadmap 
- [x] DSL metamodel with ecore
- [x] *ReLIS* project classification data modelization (from database)
- [x] R statistic functions migration to Python
- [x] Python executable artifacts autogeneration with TWIG templates

## 📜 Supported statistical functions by categories

| Statistics category | Name | Variable type | Migrated to Python |
|----|----|----|----|
| ``Descriptive`` | Frequency tables | Nominal | Yes |
| `Descriptive` | Bar plots | Nominal | Yes |
| `Descriptive` | Statistics | Continuous | Yes |
| `Descriptive` | Box plots | Continuous | Yes |
| `Descriptive` | Violin plots | Continuous | Yes |
| `Evolution` | Frequency tables | Nominal | Yes |
| `Evolution` | Evolution plots | Nominal | Yes |
| ``Comparative`` | Frequency tables | Nominal | Yes |
| `Comparative` | Stacked bar plots | Nominal | Yes |
| `Comparative` | Grouped bar plots | Nominal | Yes |
| `Comparative` | Bubble charts | Nominal | Yes |
| `Comparative` | Fisher's exact test | Nominal | Yes |
| `Comparative` | Shapiro Wilk's correlation test | Continuous | Yes |
| `Comparative` | Pearson's correlation test | Continuous | Yes |
| `Comparative` | Spearman's correlation test | Continuous | Yes |
