# relis-statistical-analysis-dsl

## 🔍 Overview

This repository extends the statistical analysis capabilities of *[ReLiS](https://github.com/geodes-sms/relis)* : a tool for conducting systematic reviews, develop by the [GEODES](https://geodes.iro.umontreal.ca/) software engineering group at the [University of Montreal](https://www.umontreal.ca/en/).

It provides to the users a comprehensive Python environment to performs the statistical analysis of their *ReLiS* SR project classification data. 

It uses a *Domain Specific Modeling* approach (DSM), including a *Domain specific language* (DSL), to generate statistical analysis models from the *SR* project classification data.
These models are then used to automatically generate the executable artifacts used in the Python environment.

**Primary authors:** Louis Lalonde [@louislalonde](https://github.com/LouisLalonde) and Hanz Schepens [@Wickkawizz](https://github.com/Wickkawizz)

## Repositories

- <a href="https://github.com/LouisLalonde/relis-statistical-classification" target="_blank">DSL</a>
- <a href="https://github.com/LouisLalonde/relis-statistical-templates" target="_blank">Environment</a>
- <a href="https://github.com/LouisLalonde/relis-classifiers-injector" target="_blank">Classifiers-Injector</a>

## 🚀 Roadmap 
- [x] DSL metamodel with ecore
- [x] *ReLIS* project statistical analysis modelization (from database)
- [x] R statistical functions migration to Python
- [x] Python artifacts autogeneration from TWIG templates

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
| `Comparative` | Chi-squared test | Nominal | Yes |
| `Comparative` | Shapiro Wilk's correlation test | Continuous | Yes |
| `Comparative` | Pearson's correlation test | Continuous | Yes |
| `Comparative` | Spearman's correlation test | Continuous | Yes |
