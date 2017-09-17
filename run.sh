#!/bin/sh









# ======================================================================================

GITHUB=maluyvova

WS_DIR=Workspace

REPO=HW_29

VERSION=1.0

MAIN_CLASS=core.Input_Scanner


# ======================================================================================






if [ -d "/Users/maluy/Desktop/$WS_DIR" ]; then cd ~/$WS_DIR; else echo $WS_DIR is not exist; return; fi





git clone https://github.com/$GITHUB/$REPO.git

cd ./$REPO




mvn package


java -cp ./target/HW_28-1.0.jar core.Input_Scanner



