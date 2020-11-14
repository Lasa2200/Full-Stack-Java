< !DOCTYPE html > < html lang = "en" > < head > < meta charset = "UTF-8" > < meta name = "act. Pacman"
content = "recrear pacman coding dojo" > < title > Pacman < /title><style type="text/css
">body {
background - color: black;
margin: 0 px;
line - height: 0 px;
}

div.row div {
    width: 20 px;
    height: 20 px;
    display: inline - block;
}

div.ladrillo {
    background - color: blue;
    margin: 0 % ;
}

div.vacio {
    background - color: black;
    width: 20 px;
    height: 20 px;
}

div.coin {
    background: url("img/moneda-mario-bros-80149.gif");
    background - repeat: no - repeat;
    background - position: center;
}

div# pacman {
    background: url("img/pacman.gif");
    background - repeat: no - repeat;
    background - position: center;
    background - size: cover;
    width: 20 px;
    height: 20 px;
    position: absolute;
}

div# pacman2 {
    background: url("img/pacman.gif");
    background - repeat: no - repeat;
    background - position: center;
    background - size: cover;
    width: 20 px;
    height: 20 px;
    position: absolute;
}

div# puntaje {
    border: 1 px solid white;
    width: 50 px;
    height: 20 px;
    color: white;
    text - align: center;
    padding - top: 10 px;
    position: absolute;
    top: 10 px;
    left: 400 px;
}

div.cereza {
    background: url("img/cerecita.gif");
    background - repeat: no - repeat;
    background - position: center;
    background - size: cover;
    width: 20 px;
    height: 20 px;
}

div.fantasma {
    background: url("img/fantasma.gif");
    background - repeat: no - repeat;
    background - position: center;
    background - size: cover;
    width: 20 px;
    height: 20 px;
}

.down {
    background: url("img/pacmanabajo.gif");
}

<
/style></head > < body > < div id = "container" > < div id = "mundo" > < /div><div id="pacman" style="top:23px; left:23px;"></div > < div id = "pacman2"
style = "top:240px; left:23px;" > < /div><div id="puntaje">0</div > < /div><script>var mundo=[ [2,
2,
2,
2,
2,
2,
2,
2,
2,
2,
2,
2,
2,
2], [2,
    0,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    2
], [2,
    1,
    2,
    2,
    1,
    2,
    2,
    2,
    1,
    2,
    1,
    2,
    1,
    2
], [2,
    1,
    2,
    2,
    3,
    1,
    1,
    1,
    1,
    1,
    3,
    1,
    1,
    2
], [2,
    1,
    1,
    2,
    1,
    2,
    1,
    2,
    2,
    2,
    2,
    1,
    1,
    2
], [2,
    2,
    1,
    2,
    1,
    2,
    1,
    2,
    1,
    1,
    1,
    1,
    2,
    2
], [0,
    2,
    1,
    2,
    1,
    2,
    1,
    2,
    1,
    2,
    2,
    2,
    2,
    0
], [0,
    2,
    1,
    1,
    1,
    1,
    4,
    1,
    1,
    1,
    1,
    1,
    2,
    0
], [2,
    2,
    1,
    2,
    2,
    2,
    2,
    2,
    2,
    2,
    2,
    1,
    2,
    2
], [2,
    1,
    1,
    1,
    2,
    2,
    1,
    1,
    1,
    1,
    1,
    1,
    2,
    2
], [2,
    1,
    2,
    1,
    1,
    2,
    1,
    2,
    1,
    2,
    2,
    1,
    1,
    2
], [2,
    1,
    2,
    2,
    1,
    1,
    1,
    2,
    1,
    2,
    2,
    2,
    1,
    2
], [2,
    0,
    3,
    1,
    1,
    2,
    2,
    2,
    1,
    1,
    1,
    3,
    1,
    2
], [2,
    2,
    2,
    2,
    2,
    2,
    2,
    2,
    2,
    2,
    2,
    2,
    2,
    2
]];
var pacman = {
    x: 0,
    y: 0
}

;
var pacman2 = {
    x: 1,
    y: 220
}

;
var fantasma = {
    x: 1,
    y: 150
}

var puntaje = 0;

function displayMundo() {
    var output = 'pacman';
    for (i = 0; i < mundo.length; i++) {
        output += "\n<div class='row'>\n";
        for (j = 0; j < mundo[i].length; j++) {
            if (mundo[i][j] == 2) {
                output += "<div class='ladrillo'></div>";
            } else if (mundo[i][j] == 1) {
                output += "<div class='coin'></div>";
            } else if (mundo[i][j] == 0) {
                output += "<div class='vacio'></div>";
            } else if (mundo[i][j] == 3) {
                output += "<div class='cereza'></div>";
            } else if (mundo[i][j] == 4) {
                output += "<div class='fantasma'></div>";
            }
        }
        output += "\n</div>";
    }
    document.getElementById('mundo').innerHTML = output;
}

function displayPuntaje() {
    document.getElementById("puntaje").innerHTML = puntaje;
}

function displayfantasma() {
    document.getElementById('fantasma').style['top'] = fantasma.y + 20 + "px";
    document.getElementById('fantasma').style['left'] = fantasma.x + 20 + "px";
}

function displayPacman() {
    document.getElementById("pacman").style.left = pacman.x + 20 + "px";
    document.getElementById("pacman").style.top = pacman.y + 20 + "px";
}

function displayPacman2() {
    document.getElementById("pacman2").style.left = pacman2.x + 20 + "px";
    document.getElementById("pacman2").style.top = pacman2.y + 20 + "px";
}

displayMundo();
displayPuntaje();
displayPacman();
displayPacman2();
document.onkeydown = function(mov) {
    if (mov.keyCode == 37) {
        pacman.x -= 20;
        document.getElementById("pacman").style.backgroundImage = "url('img/pacmanizq.gif')";
    } else if (mov.keyCode == 39) {
        pacman.x += 20;
        document.getElementById("pacman").style.backgroundImage = "url('img/pacman.gif')";
    } else if (mov.keyCode == 38) {
        pacman.y -= 20;
        document.getElementById("pacman").style.backgroundImage = "url('img/pacmanarriba.gif')";
    } else if (mov.keyCode == 40) {
        pacman.y += 20;
        document.getElementById("pacman").style.backgroundImage = "url('img/pacmanabajo.gif')";
    }
    if (mov.keyCode == 83) {
        pacman2.x += 20;
        document.getElementById("pacman2").style.backgroundImage = "url('img/pacman.gif')";
    } else if (mov.keyCode == 65) {
        pacman2.x -= 20;
        document.getElementById("pacman2").style.backgroundImage = "url('img/pacmanizq.gif')";
    } else if (mov.keyCode == 87) {
        pacman2.y -= 20;
        document.getElementById("pacman2").style.backgroundImage = "url('img/pacmanarriba.gif')";
    } else if (mov.keyCode == 90) {
        pacman2.y += 20;
        document.getElementById("pacman2").style.backgroundImage = "url('img/pacmanabajo.gif')";
    }
    displayPacman();
    displayPacman2() if (mundo[pacman.y][pacman.x] == 1) {
        mundo[pacman.y][pacman.x] == 0;
        score += 10;
        displayMundo();
    }
}

<
/script></body > < /html>