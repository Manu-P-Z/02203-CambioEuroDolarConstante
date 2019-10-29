/* 
 * Copyright 2019 Manu Portolés.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java;

import java.util.Locale;

/**
 *
 * @author Manu Portolés
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final double CAMBIO_EURO_DOLAR = 1.09718;

        System.out.printf(Locale.ENGLISH, "%s %f $%n", "El cambio de hoy es 1€ por", CAMBIO_EURO_DOLAR);

    }

}
