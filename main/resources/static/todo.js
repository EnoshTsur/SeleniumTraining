
// number for counting up
var number = 0;

// Task CTR
var Mission = function(message , number)
{
    this.message = message;
    this.number = number;
    this.done = false;
}

// Array for tasks
var missions = [];