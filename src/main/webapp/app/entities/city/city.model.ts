export interface ICity {
  id?: number;
  cityName?: string | null;
}

export class City implements ICity {
  constructor(public id?: number, public cityName?: string | null) {}
}

export function getCityIdentifier(city: ICity): number | undefined {
  return city.id;
}
