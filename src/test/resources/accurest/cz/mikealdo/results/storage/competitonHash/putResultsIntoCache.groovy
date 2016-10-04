package accurest.cz.mikealdo.results.storage.competitonHash

import io.codearte.accurest.dsl.Accurest

Accurest.make {
    request {
        method 'GET'
        url '/api/3da83071-b450-4852-b349-201990550e50'
        headers {
            header 'Content-Type': 'application/vnd.cz.mikealdo.results-storage.v1+json'
        }
        body '''OK'''
    }
    request {
        method 'GET'
        url '/api/3da83071-b450-4852-b349-201990550e50'
        headers {
            header 'Content-Type': 'application/vnd.cz.mikealdo.results-storage.v1+json'
        }
        body '''\
                [{
                    "competitionHash" : "3da83071-b450-4852-b349-201990550e50",
                    "competitionName": "FITPARTNER GASTRO I.B třída skupina D",
                    "competitionDescription": "ročník 2016, A3D, Muži, číslo 2016210A3D"

                        ,"teams": [

                                {
                                    "pairingId": 1,
                                    "pairingTeamName": "FC Jílové"
                                }
                                ,

                                {
                                    "pairingId": 2,
                                    "pairingTeamName": "FK FERCOM Týnec nad Sázavou"
                                }
                                ,

                                {
                                    "pairingId": 3,
                                    "pairingTeamName": "TJ Sokol Kondrac"
                                }
                                ,

                                {
                                    "pairingId": 4,
                                    "pairingTeamName": "TJ Sokol Teplýšovice"
                                }
                                ,

                                {
                                    "pairingId": 5,
                                    "pairingTeamName": "TJ Sokol Vyšehořovice"
                                }
                                ,

                                {
                                    "pairingId": 6,
                                    "pairingTeamName": "TJ Sokol NEVEKLOV"
                                }
                                ,

                                {
                                    "pairingId": 7,
                                    "pairingTeamName": "AFK Kácov"
                                }
                                ,

                                {
                                    "pairingId": 8,
                                    "pairingTeamName": "TJ Sokol Miřetice"
                                }
                                ,

                                {
                                    "pairingId": 9,
                                    "pairingTeamName": "TJ Jiskra Zruč nad Sázavou"
                                }
                                ,

                                {
                                    "pairingId": 10,
                                    "pairingTeamName": "TJ Sokol Jankov"
                                }
                                ,

                                {
                                    "pairingId": 11,
                                    "pairingTeamName": "TJ SOKOL Sedlec-Prčice"
                                }
                                ,

                                {
                                    "pairingId": 12,
                                    "pairingTeamName": "Spartak Průhonice"
                                }
                                ,

                                {
                                    "pairingId": 13,
                                    "pairingTeamName": "FK Uhlířské Janovice"
                                }
                                ,

                                {
                                    "pairingId": 14,
                                    "pairingTeamName": "Sokol Maršovice"
                                }


                        ]


                        ,
                            "matches": [

                                        {
                                            "homeTeam": {
                                                "pairingId": "1",
                                                "pairingTeamName": "FC Jílové"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "14",
                                                "pairingTeamName": "Sokol Maršovice"
                                            },
                                             "result": "5:1",
                                            "round": 1,
                                            "date": "2016-08-27 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "2",
                                                "pairingTeamName": "FK FERCOM Týnec nad Sázavou"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "13",
                                                "pairingTeamName": "FK Uhlířské Janovice"
                                            },
                                             "result": "5:0",
                                            "round": 1,
                                            "date": "2016-08-27 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "3",
                                                "pairingTeamName": "TJ Sokol Kondrac"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "12",
                                                "pairingTeamName": "Spartak Průhonice"
                                            },
                                             "result": "3:1",
                                            "round": 1,
                                            "date": "2016-08-28 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "4",
                                                "pairingTeamName": "TJ Sokol Teplýšovice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "11",
                                                "pairingTeamName": "TJ SOKOL Sedlec-Prčice"
                                            },
                                             "result": "5:2",
                                            "round": 1,
                                            "date": "2016-08-27 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "5",
                                                "pairingTeamName": "TJ Sokol Vyšehořovice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "10",
                                                "pairingTeamName": "TJ Sokol Jankov"
                                            },
                                             "result": "2:1",
                                            "round": 1,
                                            "date": "2016-08-27 10:15"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "6",
                                                "pairingTeamName": "TJ Sokol NEVEKLOV"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "9",
                                                "pairingTeamName": "TJ Jiskra Zruč nad Sázavou"
                                            },
                                             "result": "0:1",
                                            "round": 1,
                                            "date": "2016-08-27 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "7",
                                                "pairingTeamName": "AFK Kácov"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "8",
                                                "pairingTeamName": "TJ Sokol Miřetice"
                                            },
                                             "result": "1:2p",
                                            "round": 1,
                                            "date": "2016-08-28 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "1",
                                                "pairingTeamName": "FC Jílové"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "2",
                                                "pairingTeamName": "FK FERCOM Týnec nad Sázavou"
                                            },
                                             "result": "1:0",
                                            "round": 2,
                                            "date": "2016-09-03 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "9",
                                                "pairingTeamName": "TJ Jiskra Zruč nad Sázavou"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "7",
                                                "pairingTeamName": "AFK Kácov"
                                            },
                                             "result": "1:2",
                                            "round": 2,
                                            "date": "2016-09-03 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "10",
                                                "pairingTeamName": "TJ Sokol Jankov"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "6",
                                                "pairingTeamName": "TJ Sokol NEVEKLOV"
                                            },
                                             "result": "2:3p",
                                            "round": 2,
                                            "date": "2016-09-04 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "11",
                                                "pairingTeamName": "TJ SOKOL Sedlec-Prčice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "5",
                                                "pairingTeamName": "TJ Sokol Vyšehořovice"
                                            },
                                             "result": "1:2",
                                            "round": 2,
                                            "date": "2016-09-04 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "12",
                                                "pairingTeamName": "Spartak Průhonice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "4",
                                                "pairingTeamName": "TJ Sokol Teplýšovice"
                                            },
                                             "result": "0:1",
                                            "round": 2,
                                            "date": "2016-09-03 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "13",
                                                "pairingTeamName": "FK Uhlířské Janovice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "3",
                                                "pairingTeamName": "TJ Sokol Kondrac"
                                            },
                                             "result": "1:0",
                                            "round": 2,
                                            "date": "2016-09-04 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "14",
                                                "pairingTeamName": "Sokol Maršovice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "8",
                                                "pairingTeamName": "TJ Sokol Miřetice"
                                            },
                                             "result": "2:1",
                                            "round": 2,
                                            "date": "2016-09-04 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "2",
                                                "pairingTeamName": "FK FERCOM Týnec nad Sázavou"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "14",
                                                "pairingTeamName": "Sokol Maršovice"
                                            },
                                             "result": "3:2",
                                            "round": 3,
                                            "date": "2016-09-10 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "3",
                                                "pairingTeamName": "TJ Sokol Kondrac"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "1",
                                                "pairingTeamName": "FC Jílové"
                                            },
                                             "result": "2:1",
                                            "round": 3,
                                            "date": "2016-09-11 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "4",
                                                "pairingTeamName": "TJ Sokol Teplýšovice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "13",
                                                "pairingTeamName": "FK Uhlířské Janovice"
                                            },
                                             "result": "3:2",
                                            "round": 3,
                                            "date": "2016-09-10 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "5",
                                                "pairingTeamName": "TJ Sokol Vyšehořovice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "12",
                                                "pairingTeamName": "Spartak Průhonice"
                                            },
                                             "result": "10:3",
                                            "round": 3,
                                            "date": "2016-09-10 10:15"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "6",
                                                "pairingTeamName": "TJ Sokol NEVEKLOV"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "11",
                                                "pairingTeamName": "TJ SOKOL Sedlec-Prčice"
                                            },
                                             "result": "0:2",
                                            "round": 3,
                                            "date": "2016-09-10 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "7",
                                                "pairingTeamName": "AFK Kácov"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "10",
                                                "pairingTeamName": "TJ Sokol Jankov"
                                            },
                                             "result": "3:1",
                                            "round": 3,
                                            "date": "2016-09-11 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "8",
                                                "pairingTeamName": "TJ Sokol Miřetice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "9",
                                                "pairingTeamName": "TJ Jiskra Zruč nad Sázavou"
                                            },
                                             "result": "2:1",
                                            "round": 3,
                                            "date": "2016-09-11 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "1",
                                                "pairingTeamName": "FC Jílové"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "4",
                                                "pairingTeamName": "TJ Sokol Teplýšovice"
                                            },
                                             "result": "2:0",
                                            "round": 4,
                                            "date": "2016-09-17 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "2",
                                                "pairingTeamName": "FK FERCOM Týnec nad Sázavou"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "3",
                                                "pairingTeamName": "TJ Sokol Kondrac"
                                            },
                                             "result": "2:0",
                                            "round": 4,
                                            "date": "2016-09-17 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "10",
                                                "pairingTeamName": "TJ Sokol Jankov"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "8",
                                                "pairingTeamName": "TJ Sokol Miřetice"
                                            },
                                             "result": "6:2",
                                            "round": 4,
                                            "date": "2016-09-18 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "11",
                                                "pairingTeamName": "TJ SOKOL Sedlec-Prčice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "7",
                                                "pairingTeamName": "AFK Kácov"
                                            },
                                             "result": "2:0",
                                            "round": 4,
                                            "date": "2016-09-18 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "12",
                                                "pairingTeamName": "Spartak Průhonice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "6",
                                                "pairingTeamName": "TJ Sokol NEVEKLOV"
                                            },
                                             "result": "5:0",
                                            "round": 4,
                                            "date": "2016-09-17 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "13",
                                                "pairingTeamName": "FK Uhlířské Janovice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "5",
                                                "pairingTeamName": "TJ Sokol Vyšehořovice"
                                            },
                                             "result": "4:0",
                                            "round": 4,
                                            "date": "2016-09-18 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "14",
                                                "pairingTeamName": "Sokol Maršovice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "9",
                                                "pairingTeamName": "TJ Jiskra Zruč nad Sázavou"
                                            },
                                             "result": "4:6",
                                            "round": 4,
                                            "date": "2016-09-18 17:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "3",
                                                "pairingTeamName": "TJ Sokol Kondrac"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "14",
                                                "pairingTeamName": "Sokol Maršovice"
                                            },

                                            "round": 5,
                                            "date": "2016-09-25 16:30"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "4",
                                                "pairingTeamName": "TJ Sokol Teplýšovice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "2",
                                                "pairingTeamName": "FK FERCOM Týnec nad Sázavou"
                                            },

                                            "round": 5,
                                            "date": "2016-09-24 16:30"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "5",
                                                "pairingTeamName": "TJ Sokol Vyšehořovice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "1",
                                                "pairingTeamName": "FC Jílové"
                                            },

                                            "round": 5,
                                            "date": "2016-09-24 10:15"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "6",
                                                "pairingTeamName": "TJ Sokol NEVEKLOV"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "13",
                                                "pairingTeamName": "FK Uhlířské Janovice"
                                            },

                                            "round": 5,
                                            "date": "2016-09-24 16:30"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "7",
                                                "pairingTeamName": "AFK Kácov"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "12",
                                                "pairingTeamName": "Spartak Průhonice"
                                            },

                                            "round": 5,
                                            "date": "2016-09-25 16:30"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "8",
                                                "pairingTeamName": "TJ Sokol Miřetice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "11",
                                                "pairingTeamName": "TJ SOKOL Sedlec-Prčice"
                                            },

                                            "round": 5,
                                            "date": "2016-09-25 16:30"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "9",
                                                "pairingTeamName": "TJ Jiskra Zruč nad Sázavou"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "10",
                                                "pairingTeamName": "TJ Sokol Jankov"
                                            },

                                            "round": 5,
                                            "date": "2016-09-24 16:30"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "1",
                                                "pairingTeamName": "FC Jílové"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "6",
                                                "pairingTeamName": "TJ Sokol NEVEKLOV"
                                            },

                                            "round": 6,
                                            "date": "2016-10-01 16:30"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "2",
                                                "pairingTeamName": "FK FERCOM Týnec nad Sázavou"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "5",
                                                "pairingTeamName": "TJ Sokol Vyšehořovice"
                                            },

                                            "round": 6,
                                            "date": "2016-10-01 16:30"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "3",
                                                "pairingTeamName": "TJ Sokol Kondrac"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "4",
                                                "pairingTeamName": "TJ Sokol Teplýšovice"
                                            },

                                            "round": 6,
                                            "date": "2016-10-02 16:30"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "11",
                                                "pairingTeamName": "TJ SOKOL Sedlec-Prčice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "9",
                                                "pairingTeamName": "TJ Jiskra Zruč nad Sázavou"
                                            },

                                            "round": 6,
                                            "date": "2016-10-02 16:30"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "12",
                                                "pairingTeamName": "Spartak Průhonice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "8",
                                                "pairingTeamName": "TJ Sokol Miřetice"
                                            },

                                            "round": 6,
                                            "date": "2016-10-01 16:30"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "13",
                                                "pairingTeamName": "FK Uhlířské Janovice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "7",
                                                "pairingTeamName": "AFK Kácov"
                                            },

                                            "round": 6,
                                            "date": "2016-10-02 16:30"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "14",
                                                "pairingTeamName": "Sokol Maršovice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "10",
                                                "pairingTeamName": "TJ Sokol Jankov"
                                            },

                                            "round": 6,
                                            "date": "2016-10-02 16:30"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "4",
                                                "pairingTeamName": "TJ Sokol Teplýšovice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "14",
                                                "pairingTeamName": "Sokol Maršovice"
                                            },

                                            "round": 7,
                                            "date": "2016-10-08 16:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "5",
                                                "pairingTeamName": "TJ Sokol Vyšehořovice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "3",
                                                "pairingTeamName": "TJ Sokol Kondrac"
                                            },

                                            "round": 7,
                                            "date": "2016-10-08 10:15"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "6",
                                                "pairingTeamName": "TJ Sokol NEVEKLOV"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "2",
                                                "pairingTeamName": "FK FERCOM Týnec nad Sázavou"
                                            },

                                            "round": 7,
                                            "date": "2016-10-08 16:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "7",
                                                "pairingTeamName": "AFK Kácov"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "1",
                                                "pairingTeamName": "FC Jílové"
                                            },

                                            "round": 7,
                                            "date": "2016-10-09 16:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "8",
                                                "pairingTeamName": "TJ Sokol Miřetice"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "13",
                                                "pairingTeamName": "FK Uhlířské Janovice"
                                            },

                                            "round": 7,
                                            "date": "2016-10-09 16:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "9",
                                                "pairingTeamName": "TJ Jiskra Zruč nad Sázavou"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "12",
                                                "pairingTeamName": "Spartak Průhonice"
                                            },

                                            "round": 7,
                                            "date": "2016-10-08 16:00"
                                        }
                                        ,

                                        {
                                            "homeTeam": {
                                                "pairingId": "10",
                                                "pairingTeamName": "TJ Sokol Jankov"
                                            },
                                            "visitorTeam": {
                                                "pairingId": "11",
                                                "pairingTeamName": "TJ SOKOL Sedlec-Prčice"
                                            },

                                            "round": 7,
                                            "date": "2016-10-09 16:00"
                                        }


                                ]


                }]
'''
    }
    response {
        status 200
    }
}