CREATE TABLE IF NOT EXISTS `TBL_SyncChests` (
`ID` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
`owner` TEXT NOT NULL,
`nodeName` TEXT NOT NULL,
`doubleChest` BOOLEAN NOT NULL,
`xPos` INTEGER NOT NULL ,
`yPos` INTEGER NOT NULL ,
`zPos` INTEGER NOT NULL ,
`worldName` TEXT NOT NULL
);