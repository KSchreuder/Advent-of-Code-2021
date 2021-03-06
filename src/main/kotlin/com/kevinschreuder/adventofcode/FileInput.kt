package com.kevinschreuder.adventofcode

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.ArrayList

class FileInput constructor(private val resource: String) : ArrayList<String>()
{
    init
    {
        val inStream = FileInput::class.java.classLoader.getResourceAsStream(this.resource)
        val inReader = InputStreamReader(inStream!!)
        val bufReader = BufferedReader(inReader)
        var current = ""

        while (bufReader.readLine()?.also { current = it } != null)
        {
            this.add(current)
        }
    }
}