package com.example.myapplication.data.mapper

import com.example.myapplication.data.dto.DefinitionDto
import com.example.myapplication.data.dto.MeaningDto
import com.example.myapplication.data.dto.PhoneticDto
import com.example.myapplication.data.dto.WordItemDto
import com.example.myapplication.domain.model.Definition
import com.example.myapplication.domain.model.Meaning
import com.example.myapplication.domain.model.Phonetic
import com.example.myapplication.domain.model.WordItem

fun WordItemDto.toWordItem() = WordItem (
    word = word ?: "",
    phonetic = phonetic ?: "",
    phonetics = phonetics?.map {
        it.toPhonetic()
    } ?: emptyList(),
    meanings = meanings?.map {
        it.toMeaning()
    } ?: emptyList()
)

fun MeaningDto.toMeaning() = Meaning (
    antonyms = antonyms,
    definitions = definitionDtoListToDefinitionList(
        definitions
    ) ?: emptyList(),
    partOfSpeech = partOfSpeech ?: "",
    synonyms = synonyms
)

fun PhoneticDto.toPhonetic() = Phonetic (
    audio = audio ?: "",
    text = text ?: ""
)


fun DefinitionDto.toDefinition() = Definition (
    definition = definition ?: "",
    example = example ?: ""
)

fun definitionDtoListToDefinitionList(
    definitionDtoList: List<DefinitionDto>?
): List<Definition>? {
    return definitionDtoList?.map {
        it.toDefinition()
    }
}

