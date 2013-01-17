/*
 * Copyright (c) 2008 - 2012 10gen, Inc. <http://10gen.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.code.morphia.testmodel;

import com.google.code.morphia.annotations.Property;
import com.google.code.morphia.testutil.TestEntity;

public class Circle extends TestEntity implements Shape {
    private static final long serialVersionUID = 2847359985370660943L;

    @Property
    private double radius;

    public Circle() {
        super();
    }

    public Circle(final double radius) {
        super();
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public double getRadius() {
        return radius;
    }
}
