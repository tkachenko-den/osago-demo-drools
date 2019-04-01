Пример вызова:


POST /kie-server/services/rest/server/containers/instances/OSAGO-demo-refactoring_2.0.3 HTTP/1.1
Host: drools-wb-dev.vsk.ru:4000
Content-Type: application/json
X-KIE-ContentType: json
cache-control: no-cache
Postman-Token: c00ea8b5-48a7-4084-bd4f-a72629073e9e
{
	"lookup": "SL",
	"commands": [{
			"insert": {
				"object": {
					"ru.vsk.dr.osago_demo_sample.Car": {
						"horsePower": 120,
						"isTaxi": false,
						"maxWeight": 2,
						"osagoCarCategory": "Легковые",
						"passSeatsCount": 5,
						"isUsingWithTrailer": true,
						"registrationType": "RF"
					}
				}
			}
		}, {
			"insert": {
				"object": {
					"ru.vsk.dr.osago_demo_sample.OsagoPolicy": {
						"usePeriod1From": "2019-01-01",
						"usePeriod1To": "2019-02-08",
						"usePeriod2From": "2019-03-14",
						"usePeriod2To": "2019-09-24",
						"isUnlimitedDrivers": false,
						"isApplyViolationKoef": false,
						"insDuration": "6 month"
					}
				}
			}
		}, {
			"insert": {
				"object": {
					"ru.vsk.dr.osago_demo_sample.Insurant": {
						"type": "ФЛ"
					}
				}
			}
		}, {
			"insert": {
				"object": {
					"ru.vsk.dr.osago_demo_sample.UsingTerritory": {
						"usePeriod1From": "2019-01-01",
						"usePeriod1To": "2019-02-08",
						"usePeriod2From": "2019-03-14",
						"usePeriod2To": "2019-09-24",
						"isUnlimitedDrivers": false,
						"isApplyViolationKoef": false,
						"insDuration": "6 month"
					}
				}
			}
		}, {
			"insert": {
				"object": {
					"ru.vsk.dr.osago_demo_sample.Driver": {
						"age": 40,
						"stage": 7,
						"claimCount": 0,
						"kbmPrevious": 3,
						"lastName": "Петров",
						"firstName": "Василий",
						"middleName": "Петрович"
					}
				}
			}
		}, {
			"insert": {
				"object": {
					"ru.vsk.dr.osago_demo_sample.Driver": {
						"age": 18,
						"stage": 1,
						"claimCount": 1,
						"kbmPrevious": 3
					}
				}
			}
		}, {
			"fire-all-rules": {
				"max": -1,
				"out-identifier": "fired"
			}
		}, {
			"query": {
				"out-identifier": "q1",
				"name": "CalculationResult"
			}
		}
	]
}------WebKitFormBoundary7MA4YWxkTrZu0gW--
