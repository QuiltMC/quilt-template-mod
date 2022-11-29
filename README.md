# Quilt Template Mod

My personalized Quilt template Mod. You can use it as a template for your own mods!

## Differences from the Official Mod
- Added a build github action
- Added gametest support (See [Gametest Support](#Gametest Support))
## Usage

In order to use this mod as a template:

1. Create a new repository from this template with `Use this template`
2. Clone the recently-created repo on your PC
3. Make the necessary changes in order to make it yours:
    - Update `gradle.properties` in order to use your Maven group and mod ID
        - If you don't know which Maven group to use, and you are planning to host the mod's source code on GitHub, use `io.github.<Your_Username_Here>`
    - Update `quilt.mod.json` in `src/main/resources` in order to reflect your mod's metadata
        - If you are planning to include (jar-in-jar) a mod, don't forget to declare its dependency on it!
        - The icon provided here is a placeholder one. If you aren't able to replace it yet, you can delete it and remove the "icon" property
    - Create a LICENSE file for this mod! If you don't know which license to use, check out [here](https://choosealicense.com/).
        - In `quilt.mod.json`, don't forget to put the license's [SPDX identifier](https://spdx.org/licenses/) under the `"license"` property in `"metadata"`.
        - The GPLv3 and AGPLv3 are not valid mod licenses, so you can use almost any license except for those.
    - Update the Java sub-directory structure so it reflects your Maven group
    - If the dependencies on `gradle/libs.versions.toml` isn't up-to-date, feel free to update them! The [linked utility](https://lambdaurora.dev/tools/import_quilt.html) should help you in this easy and quick process.
4. The mod is now ready to be worked on!

### Gametest Support
1. Update `quilt.mod.json` in `src/gametest/resources` and the rest of the naming in order to reflect your testmod's metadata

> :warning: **WARNING**
>
> make sure to change the dependency on `example_mod` to your modid and to not reuse the modid of your main project, e.g. suffix your project's modid with `_test`
>

2. Now testing should be available using the test gradle task

## License

This template on the QuiltMC GitHub is licensed under the [Creative Common Zero v1.0 license](./LICENSE-TEMPLATE.md).

Mods created with this template are not automatically licensed under the CC0, and are not required to give any kind of credit back to QuiltMC for this template.
