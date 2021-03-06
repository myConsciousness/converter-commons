# Converter Commons

## What is it?

It is a package that manages the generic standards and processes that perform the conversion process.

This package was created for use in my personal side project, but it is necessary to import this package if you want to use a package created using the standards in this package.

## How To Use

> **_Note:_**<br>
> Replace version you want to use. Check the latest [Packages](https://github.com/myConsciousness/converter-commons/packages).<br>
> Please contact me for a token to download the package.

**_Maven_**

```xml
<dependency>
  <groupId>org.thinkit.converter.common</groupId>
  <artifactId>converter-commons</artifactId>
  <version>v1.0.0</version>
</dependency>

<servers>
  <server>
    <id>github</id>
    <username>myConsciousness</username>
    <password>xxxxxxxxxxxxxxxxxx</password>
  </server>
</servers>
```

**_Gradle_**

```gradle
repositories {
    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/myConsciousness/converter-commons")
        credentials {
          username = "myConsciousness"
          password = "xxxxxxxxxxxxxxxxxx"
        }
    }
}

dependencies {
    implementation 'org.thinkit.converter.common:converter-commons:v1.0.0'
}
```

## License

```
Copyright 2020 Kato Shinya.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
in compliance with the License. You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License
is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
or implied. See the License for the specific language governing permissions and limitations under
the License.
```

## More Information

`Converter Commons` was designed and implemented by Kato Shinya, who works as a freelance developer from Japan.

Regardless of the means or content of communication, I would love to hear from you if you have any questions or concerns. I do not check my email box very often so a response may be delayed, anyway thank you for your interest!

- [Creator Profile](https://github.com/myConsciousness)
- [License](https://github.com/myConsciousness/converter-commons/blob/master/LICENSE)
- [Release Note](https://github.com/myConsciousness/converter-commons/releases)
- [Package](https://github.com/myConsciousness/converter-commons/packages)
- [File a Bug](https://github.com/myConsciousness/converter-commons/issues)
