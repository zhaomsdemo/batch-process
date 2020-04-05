package org.ootb.batch

import java.nio.file.Files
import java.nio.file.Paths

def runCommand(String uuid){
    def process = ("./run.sh " + uuid).execute()
    process.waitForProcessOutput(System.out,System.err)
}

List<String> contents = Files.readAllLines(Paths.get("./tasks"))
contents.stream().forEach({ content ->
    runCommand(content)
})