/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
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
package org.japo.java.main;

import java.util.Calendar;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public class Main {

    public static void main(String[] args) {

        //Variables
        int d;
        int m;
        int a;

        //Instanciar objeto
        Calendar CAL = Calendar.getInstance();

        //Obtener datos
        d = CAL.get(Calendar.DAY_OF_MONTH);
        m = CAL.get(Calendar.MONTH) + 1;
        a = CAL.get(Calendar.YEAR);

        //Mensaje
        System.out.printf("Fecha del sistema ....: %02d/%02d/%02d%n", d, m, a);
    }
}
