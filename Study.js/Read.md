# Entrar na pasta do projeto
cd /sdcard/SmartIDE/projeto-java

mkdir src
mkdir out

nano src/Main.java
nano .si.json

javac -d out src/Main.java
java -cp out Main

<p>
  <h1>xml</h1>
  <smartide>
    <plugin>org.smartide.plugin.java</plugin>

    <run>
        javac -d out src/Main.java && java -cp out Main
    </run>

    <gui>false</gui>

    <intelligence>
        <json enabled="true">
            vscode-json-language-server --stdio
        </json>

        <java enabled="true">
            jdtls
        </java>
    </intelligence>
</smartide>

</p>
