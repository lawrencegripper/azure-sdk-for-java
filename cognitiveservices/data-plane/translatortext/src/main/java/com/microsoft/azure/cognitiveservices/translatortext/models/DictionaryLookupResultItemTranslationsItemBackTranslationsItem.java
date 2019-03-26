/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.translatortext.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DictionaryLookupResultItemTranslationsItemBackTranslationsItem model.
 */
public class DictionaryLookupResultItemTranslationsItemBackTranslationsItem {
    /**
     * The normalizedText property.
     */
    @JsonProperty(value = "normalizedText")
    private String normalizedText;

    /**
     * The displayText property.
     */
    @JsonProperty(value = "displayText")
    private String displayText;

    /**
     * The numExamples property.
     */
    @JsonProperty(value = "numExamples")
    private Integer numExamples;

    /**
     * The frequencyCount property.
     */
    @JsonProperty(value = "frequencyCount")
    private Integer frequencyCount;

    /**
     * Get the normalizedText value.
     *
     * @return the normalizedText value
     */
    public String normalizedText() {
        return this.normalizedText;
    }

    /**
     * Set the normalizedText value.
     *
     * @param normalizedText the normalizedText value to set
     * @return the DictionaryLookupResultItemTranslationsItemBackTranslationsItem object itself.
     */
    public DictionaryLookupResultItemTranslationsItemBackTranslationsItem withNormalizedText(String normalizedText) {
        this.normalizedText = normalizedText;
        return this;
    }

    /**
     * Get the displayText value.
     *
     * @return the displayText value
     */
    public String displayText() {
        return this.displayText;
    }

    /**
     * Set the displayText value.
     *
     * @param displayText the displayText value to set
     * @return the DictionaryLookupResultItemTranslationsItemBackTranslationsItem object itself.
     */
    public DictionaryLookupResultItemTranslationsItemBackTranslationsItem withDisplayText(String displayText) {
        this.displayText = displayText;
        return this;
    }

    /**
     * Get the numExamples value.
     *
     * @return the numExamples value
     */
    public Integer numExamples() {
        return this.numExamples;
    }

    /**
     * Set the numExamples value.
     *
     * @param numExamples the numExamples value to set
     * @return the DictionaryLookupResultItemTranslationsItemBackTranslationsItem object itself.
     */
    public DictionaryLookupResultItemTranslationsItemBackTranslationsItem withNumExamples(Integer numExamples) {
        this.numExamples = numExamples;
        return this;
    }

    /**
     * Get the frequencyCount value.
     *
     * @return the frequencyCount value
     */
    public Integer frequencyCount() {
        return this.frequencyCount;
    }

    /**
     * Set the frequencyCount value.
     *
     * @param frequencyCount the frequencyCount value to set
     * @return the DictionaryLookupResultItemTranslationsItemBackTranslationsItem object itself.
     */
    public DictionaryLookupResultItemTranslationsItemBackTranslationsItem withFrequencyCount(Integer frequencyCount) {
        this.frequencyCount = frequencyCount;
        return this;
    }

}