/**
 *  Copyright 2012-2017 Gunnar Morling (http://www.gunnarmorling.de/)
 *  and/or other contributors as indicated by the @authors tag. See the
 *  copyright.txt file in the distribution for a full listing of all
 *  contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.mapstruct.example.dto;

/**
 *
 * @author Sjaak Derksen
 */
public class FishTankDto {

    private FishDto fish;
    private WaterPlantDto plant;
    private String name;
    private MaterialDto material;
    private OrnamentDto ornament;
    private WaterQualityDto quality;

    public FishDto getFish() {
        return fish;
    }

    public void setFish(FishDto fish) {
        this.fish = fish;
    }

    public WaterPlantDto getPlant() {
        return plant;
    }

    public void setPlant(WaterPlantDto plant) {
        this.plant = plant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MaterialDto getMaterial() {
        return material;
    }

    public void setMaterial(MaterialDto material) {
        this.material = material;
    }

    public OrnamentDto getOrnament() {
        return ornament;
    }

    public void setOrnament(OrnamentDto ornament) {
        this.ornament = ornament;
    }

    public WaterQualityDto getQuality() {
        return quality;
    }

    public void setQuality(WaterQualityDto quality) {
        this.quality = quality;
    }

}
