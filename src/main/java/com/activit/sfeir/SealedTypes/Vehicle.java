package com.activit.sfeir.SealedTypes;

sealed interface Vehicle permits Bus, Car {
}

record Bus() implements Vehicle {
}

record Car() implements Vehicle {
}

//This return an error because we don't allow a class to implement Vehicle other than Bus and Car : 'Bike' is not allowed in the sealed hierarchy
//record Bike() implements Vehicle {}