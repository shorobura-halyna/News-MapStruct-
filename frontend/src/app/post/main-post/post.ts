export class Post {
  private _id: number;
  private _title: string;
  private _dateTime: string;
  private _context: string;


  get id(): number {
    return this._id;
  }

  set id(value: number) {
    this._id = value;
  }

  get title(): string {
    return this._title;
  }

  set title(value: string) {
    this._title = value;
  }

  get dateTime(): string {
    return this._dateTime;
  }

  set dateTime(value: string) {
    this._dateTime = value;
  }

  get context(): string {
    return this._context;
  }

  set context(value: string) {
    this._context = value;
  }
}
