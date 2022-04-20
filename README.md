# Quilt Example Mod

The official Quilt example mod. You can use it as a template for you own mods!

## Usage

In order to use this mod as a template:

1. Create a new repository from this template with `Use this Template`
2. Clone the recently-created repo on your PC
3. Make the necessary changes in order to make it yours:
    - Update `gradle.properties` in order to use your Maven group and mod ID
        - If you don't know which Maven group to use, and you are planning to host the mod's source code on GitHub, use `com.github.<Your_Username_Here>`
    - Update `quilt.mod.json` in order to reflect your mod's metadata
        - If you are planning to include a mod, don't forget to declare its dependency on it!
        - The icon provided here is a placeholder one. If you aren't able to replace it yet, you can delete it and remove the "icon" property
    - Create a LICENSE file for this mod! If you don't know which license to use, check out [here](https://choosealicense.com/).
        - If you use `LICENSE.md`, don't forget to update the buildscript in order to use that file name!
    - Update the Java sub-directory structure so it reflects your Maven group
4. The mod is now ready to be worked on!

## License

This template on the QuiltMC GitHub is licensed under the [Creative Common Zero v1.0 license](./LICENSE-TEMPLATE.md).

Mods created with this template are not automatically licensed under the CC0, and are not required to give any kind of credit back to QuiltMC for this template.
