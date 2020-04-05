package org.ootb.batch

import java.nio.file.Files
import java.nio.file.Paths

class FileProcessor {

    def static getFileContent(String file) {
        List<String> contents = Files.readAllLines(Paths.get(file))
        contents.stream().forEach({ content ->
            println(content)
        })
    }

    def makeRandomUUID(String fileName) {
        File file = new File(fileName)
        def writer = file.newPrintWriter()
        0.upto(10, {
            writer.println(UUID.randomUUID())
        })
        writer.flush()
        writer.close()
    }
}
