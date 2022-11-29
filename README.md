# community-hub-extension-example

Example repository demonstrating the setup of Maven Build Management and CI/CD.

This repository has one purpose - demonstrate the setup of the Camunda Community HUB project development and build artifacts including:

- Camunda Community Maven Action
- Camunda Community Hub Parent

## Release

The release follows Camunda HUB release process and guidelines for Camunda HUB development process. This means:
- push on `main` branch (using gitflow or not)
- `main` branch pushes result in SNAPSHOT build / publication
- GH Milestone closure (in Issues > Milestone) will create a GH Release Draft (including the release notes collected from PR and assigned issues)
- GH Release publication results in triggering of release build:
  - reads version from release tag
  - sets version of the artifact on the `main` branch
  - creates and publishes artifacts to Camunda Artifactory and OSS Maven Central
  - archives artifacts
  - increments the version after release to the next SNAPSHOT version

## Archiving unit test results

To test archiving of test results on failing tests can be triggered by running the `Build with Maven` workflow manually and setting the `fail test` switch to true.

